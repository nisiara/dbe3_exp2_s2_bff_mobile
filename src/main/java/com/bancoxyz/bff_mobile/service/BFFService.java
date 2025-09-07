package com.bancoxyz.bff_mobile.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bancoxyz.bff_mobile.model.dto.TransactionResponse;
import com.bancoxyz.bff_mobile.restclient.RestClient;

@Service
public class BFFService {

  @Autowired
  private RestClient restClient;

  public BFFService(RestClient restClient) {
    this.restClient = restClient;
  }

  public List<TransactionResponse> findAllTransactions() {
		return restClient.findAllTransactions();
	}
  
}
