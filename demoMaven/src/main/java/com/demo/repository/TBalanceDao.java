package com.demo.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import com.demo.model.TBalance;
//import com.mysql.cj.Query;

@Repository
public class TBalanceDao implements ITBalanceDao {

    @PersistenceContext
    private EntityManager entityManager;

	private final NamedParameterJdbcTemplate jdbcTemplate;

	@Autowired
	public TBalanceDao(NamedParameterJdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<TBalance> findList(TBalance joken) {
		StringBuilder sql = new StringBuilder();
		List<String> wheres = new ArrayList<String>();
		
		sql.append("SELECT BL.KIJUN_YM, BL.TOROKU_YMD, BL.NO, BL.KAMOKU_KBN, BL.MEMO, ");
		sql.append("BL.KINGAKU, BL.INSERT_DATETIME, BL.INSERT_USER, BL.UPDATE_DATETIME, BL.UPDATE_USER ");
		sql.append("FROM T_BALANCE BL ");
		
		if (joken.getKijunYm() != "") {
			wheres.add("BL.KIJUN_YM = :KIJUN_YM");
		}
		if (joken.getTorokuYmd() != "") {
			wheres.add("BL.TOROKU_YMD = :TOROKU_YMD");
		}
		if (joken.getKamokuKbn() != "") {
			wheres.add("BL.KAMOKU_KBN = :KAMOKU_KBN");
		}
		
		if (wheres.size() > 0) {
			sql.append("WHERE ");
			sql.append(String.join(" AND ", wheres));
		}
		
		
		Query query = entityManager.createNativeQuery(sql.toString(), TBalance.class);
		if (joken.getKijunYm() != "") {
			query.setParameter("KIJUN_YM", joken.getKijunYm());
		}
		if (joken.getTorokuYmd() != "") {
			query.setParameter("TOROKU_YMD", joken.getTorokuYmd());
		}
		if (joken.getKamokuKbn() != "") {
			query.setParameter("KAMOKU_KBN", joken.getKamokuKbn());
		}
		
		@SuppressWarnings("unchecked")
		List<TBalance> dataList = query.getResultList();

		return dataList;
	}
}