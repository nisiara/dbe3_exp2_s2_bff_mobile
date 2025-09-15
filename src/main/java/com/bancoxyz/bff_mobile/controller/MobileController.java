package com.bancoxyz.bff_mobile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bancoxyz.bff_mobile.model.dto.AnnualAccountResponse;
import com.bancoxyz.bff_mobile.model.dto.InterestResponse;
import com.bancoxyz.bff_mobile.model.dto.TransactionResponse;
import com.bancoxyz.bff_mobile.service.MobileService;

@RestController 
@CrossOrigin
@RequestMapping("/api/bff-mobile")
public class MobileController {
 
  @Autowired
  private MobileService mobileService; // Servicio que procesa la lógica específica para móviles

  public MobileController(MobileService mobileService) {
    this.mobileService = mobileService; // Asigna el servicio recibido al campo de la clase
  }

 /*  
 // Endpoint comentado para obtener todas las transacciones
 // Posiblemente deshabilitado para optimizar el rendimiento en dispositivos móviles
 @GetMapping("/transaction")
  public ResponseEntity<List<TransactionResponse>> getAllTransactions(){
    return ResponseEntity.ok(mobileService.findAllTransactions());
  } 
  */

  /**
   * Endpoint específico para móviles que retorna solo transacciones inválidas
   * Implementa filtrado en el BFF para reducir el tráfico de datos hacia dispositivos móviles
   * Mejora la experiencia del usuario mostrando solo información relevante
   */
  @GetMapping("/valid-transaction") // Mapea peticiones GET a /api/bff-mobile/valid-transaction
  public ResponseEntity<List<TransactionResponse>> getInvalidTransactions(){
    return ResponseEntity.ok(mobileService.validTransactions()); // Retorna solo transacciones marcadas como válidas
  }    

  /**
   * Endpoint para obtener todos los intereses disponibles
   * Proporciona información financiera de intereses adaptada para dispositivos móviles
   */
  @GetMapping("/interest") // Mapea peticiones GET a /api/bff-mobile/interest
  public ResponseEntity<List<InterestResponse>> getAllInterests() {
    return ResponseEntity.ok(mobileService.findAllInterests()); // Retorna la lista de intereses procesada por el servicio móvil
  }

  /**
   * Endpoint para obtener información de cuentas anuales
   * Permite a las aplicaciones móviles acceder a reportes anuales de cuentas
   */
  @GetMapping("/annual-account") // Mapea peticiones GET a /api/bff-mobile/annual-account
  public ResponseEntity<List<AnnualAccountResponse>> getAllAnnualAccounts() {
    return ResponseEntity.ok(mobileService.findAllAnnualAccounts()); // Retorna información de cuentas anuales procesada
  }
  
  
  
}
