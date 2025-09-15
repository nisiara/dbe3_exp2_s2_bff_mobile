package com.bancoxyz.bff_mobile.restclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.bancoxyz.bff_mobile.model.dto.AnnualAccountResponse;
import com.bancoxyz.bff_mobile.model.dto.InterestResponse;
import com.bancoxyz.bff_mobile.model.dto.TransactionResponse;

@FeignClient(name = "backend", url = "http://localhost:8080/backend/api") // Configuración del cliente Feign apuntando al backend principal
public interface MobileRestClient {
  
  @GetMapping("/transaction")
	List<TransactionResponse> findAllTransactions();

  @GetMapping("/interest")
  List<InterestResponse> findAllInterests();
  
  @GetMapping("/annual-account")
  List<AnnualAccountResponse> findAllAnnualAccounts();
}

