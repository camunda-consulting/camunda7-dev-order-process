package com.camunda.training.services;

import java.time.LocalDate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class CreditCardService {
  
  private static final Logger LOG = LoggerFactory.getLogger(CreditCardService.class);
  
  public void chargeAmount(String cardNumber, String cvc, String expiryDate, Double amount) {
    LOG.info("charging card {} that expires on {} and has cvc {} with amount of {}", 
        cardNumber, expiryDate, cvc, amount);
    
    if (validateExpiryDate(expiryDate) == false) {
      LOG.error("expiry date {} is invalid", expiryDate);
      throw new IllegalArgumentException("invalid expiry date");
    }
    
    LOG.info("payment completed");
  }
  
}