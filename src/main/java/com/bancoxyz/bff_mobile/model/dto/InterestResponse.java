package com.bancoxyz.bff_mobile.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor

public class InterestResponse {
  private String clientName;
  private Integer balance;
}
