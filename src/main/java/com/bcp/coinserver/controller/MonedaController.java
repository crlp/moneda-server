package com.bcp.coinserver.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bcp.coinserver.bean.CoinOut;
import com.bcp.coinserver.bean.CoinRequest;
import com.bcp.coinserver.entity.Coin;
import com.bcp.coinserver.service.CoinService;

import rx.Single;

@RestController
@RequestMapping(value = "/api/coin")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class MonedaController {

	@Autowired
	CoinService coinService;
	
    @GetMapping( produces = MediaType.APPLICATION_JSON_VALUE )
    public List<Coin> getAllCoin() {
        return coinService.getAllCoin();
    }
    
    @PostMapping
    public Single<CoinOut> calculateRx (@RequestBody CoinRequest coinIn) {
    	return coinService.calculateInRx(coinIn);
    }

    
}
