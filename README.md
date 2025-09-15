# Desarrollo Backend 3 | Exp2-S2


## Objetivo del proyecto

En este proyecto de la semana 2 de la experiencia 2 implementa un Backend for Frontend (BFF) con Spring Boot.


Este repositorio en particular representa en BFF que tiene los servicios que entregan la información epecífica para el Frontend especializado para dispositivos moviles.


## 🛠️ Requisitos
- Java 21
- Maven 4.0
- Dependencias
  - Spring Web
  - Open Feign
  - Spring Boot Dev Tools
  - Lomkok


## 💾 Base de datos

#### La base de datos es de Oracle Cloud.


## 📡 API Reference

#### Endpoint para Cuentas Anuales 
Se realiza una validación para transaccines con montos y descripciones válidas. Retorna el tipo, monto y la descripción de la transacción.
```bash
curl -X GET http://localhost:8082/api/bff-mobile/annual-account
```

#### Endpoint para Intereses
Se realiza una validación para lista con montos y nombre de cliente válidos Retorna el nombre del cliente y el balance.
```bash
curl -X GET http://localhost:8082/api/bff-mobile/interest
```

#### Endpoint Transacciones
Válida que las transacciones sean de tipo 'valid'. Retorna el id, fecha, monto y tipo de transacción.
```bash
curl -X GET http://localhost:8082/api/bff-mobile/valid-transaction
```


## 🔗 Link
[![Github](https://img.shields.io/badge/github-000000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/nisiara/dbe3_exp2_s2_bff_mobile.git)