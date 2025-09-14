package com.bancoxyz.bff_mobile.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bancoxyz.bff_mobile.model.dto.AnnualAccountResponse;
import com.bancoxyz.bff_mobile.model.dto.InterestResponse;
import com.bancoxyz.bff_mobile.model.dto.TransactionResponse;
import com.bancoxyz.bff_mobile.restclient.MobileRestClient;

@Service
public class MobileService {

  @Autowired
  private MobileRestClient restClient;

  public MobileService(MobileRestClient restClient) {
    this.restClient = restClient;
  }

  private List<TransactionResponse> findAllTransactions() {
		return restClient.findAllTransactions();
	}

  public List<TransactionResponse> invalidTransactions() {
    return findAllTransactions().stream()
      .filter(transaction -> transaction.getType().equalsIgnoreCase("invalid"))
      .toList();
  }
  
  public List<InterestResponse> findAllInterests() {
    return restClient.findAllInterests();
  }

  public List<AnnualAccountResponse> findAllAnnualAccounts() {
    return restClient.findAllAnnualAccounts();
  }

}
