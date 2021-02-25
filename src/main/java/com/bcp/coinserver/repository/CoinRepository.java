package com.bcp.coinserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bcp.coinserver.entity.Coin;

@Repository
public interface CoinRepository extends JpaRepository<Coin, Long>{

}
