package com.demo.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@Table(name="T_BALANCE")
@IdClass(TBalancePK.class)
public class TBalance {
    @Id
    @Column(name="KIJUN_YM")
    private String kijunYm;
    @Id
    @Column(name="TOROKU_YMD")
    private String torokuYmd;
    @Column(name="NO")
    private Integer no;

    @Column(name="KAMOKU_KBN")
    private String kamokuKbn;
    @Column(name="MEMO")
    private String memo;
    @Column(name="KINGAKU")
    private Integer kingaku;
    @Column(name="INSERT_DATETIME")
    private Date insertDatetime;
    @Column(name="INSERT_USER")
    private String insertUser;
    @Column(name="UPDATE_DATETIME")
    private Date updateDatetime;
    @Column(name="UPDATE_USER")
    private String updateUser;
    

	public String getKijunYm() {
		return kijunYm;
	}
	public void setKijunYm(String kijunYm) {
		this.kijunYm = kijunYm;
	}
	public String getTorokuYmd() {
		return torokuYmd;
	}
	public void setTorokuYmd(String torokuYmd) {
		this.torokuYmd = torokuYmd;
	}
	public Integer getNo() {
		return no;
	}
	public void setNo(Integer no) {
		this.no = no;
	}

	public String getKamokuKbn() {
		return kamokuKbn;
	}
	public void setKamokuKbn(String kamokuKbn) {
		this.kamokuKbn = kamokuKbn;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public Integer getKingaku() {
		return kingaku;
	}
	public void setKingaku(Integer kingaku) {
		this.kingaku = kingaku;
	}
	public Date getInsertDatetime() {
		return insertDatetime;
	}
	public void setInsertDatetime(Date insertDatetime) {
		this.insertDatetime = insertDatetime;
	}
	public String getInsertUser() {
		return insertUser;
	}
	public void setInsertUser(String insertUser) {
		this.insertUser = insertUser;
	}
	public Date getUpdateDatetime() {
		return updateDatetime;
	}
	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	
	public String getTorokuYmdStr() {
		return torokuYmd.substring(0, 4) + "/" + torokuYmd.substring(4, 6) + "/" + torokuYmd.substring(6, 8);
	}
}