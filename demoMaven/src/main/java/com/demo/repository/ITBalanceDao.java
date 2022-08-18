package com.demo.repository;

import java.util.List;
import com.demo.model.TBalance;

public interface ITBalanceDao {
    // 登録されている日記を取得
    List<TBalance> findList(TBalance joken);
}