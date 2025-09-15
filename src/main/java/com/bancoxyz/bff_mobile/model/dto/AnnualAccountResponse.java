package com.bancoxyz.bff_mobile.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class AnnualAccountResponse {
  private String transactionType;
  private Integer amount;
  private String transactionDescription;
}
