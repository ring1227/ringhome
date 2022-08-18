package com.demo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.TBalance;

@Repository
public interface TBalanceRepository extends JpaRepository<TBalance, Integer> {
}