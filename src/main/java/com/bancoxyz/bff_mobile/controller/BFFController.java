package com.bancoxyz.bff_mobile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bancoxyz.bff_mobile.model.dto.TransactionResponse;
import com.bancoxyz.bff_mobile.service.BFFService;

@RestController
@CrossOrigin
@RequestMapping("/api/bff-mobile")

public class BFFController {
 
  @Autowired
  private BFFService bffService;

  public BFFController(BFFService bffService) {
    this.bffService = bffService;
  }

  @GetMapping("/transaction")
  public ResponseEntity<List<TransactionResponse>> getAllTransactions(){
    return ResponseEntity.ok(bffService.findAllTransactions());
  }
}
