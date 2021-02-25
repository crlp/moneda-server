package com.bcp.coinserver.service;

import java.util.List;

import com.bcp.coinserver.bean.CoinOut;
import com.bcp.coinserver.bean.CoinRequest;
import com.bcp.coinserver.entity.Coin;

import rx.Single;

public interface CoinService {

	List<Coin> getAllCoin();

	Single<CoinOut> calculateInRx(CoinRequest coinIn);
}
