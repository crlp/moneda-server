package com.bcp.coinserver.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcp.coinserver.bean.CoinOut;
import com.bcp.coinserver.bean.CoinRequest;
import com.bcp.coinserver.entity.Coin;
import com.bcp.coinserver.repository.CoinRepository;

import rx.Single;

@Service
public class CoinServiceImpl implements CoinService {

	@Autowired
	private CoinRepository coinRepository;

	@Override
	public List<Coin> getAllCoin() {
		return coinRepository.findAll();
	}

	@Override
	public Single<CoinOut> calculateInRx(CoinRequest coinIn) {
		
		return Single.create(singleSubscriber -> {
			Optional<Coin> coinOrigin = coinRepository.findById(coinIn.getCointOrigin());
			Optional<Coin> coinDestination = coinRepository.findById(coinIn.getCointDestination());
			if (coinOrigin.isEmpty() || coinOrigin.get() == null || coinDestination.isEmpty() || coinDestination.get() == null )            	
	                singleSubscriber.onError(new EntityNotFoundException());
			   
			double amount = Math.round((coinIn.getAmount() *  coinDestination.get().getValue()) * 100.0) / 100.0;
            singleSubscriber.onSuccess(new CoinOut(coinIn.getAmount(), amount, coinOrigin.get(), coinDestination.get()));
        });
	
	}

}
