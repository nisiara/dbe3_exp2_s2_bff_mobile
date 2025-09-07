# Desarrollo Backend 3 | Exp2-S1


## Objetivo del proyecto

En este proyecto de la semana 1 de la experiencia 2 implementa un Backend for Frontend (BFF) con Spring Boot.


Este repositorio en particular representa en BFF que tiene los servicios que entregan la información epecífica para el Frontend. En este caso es un Frontend para dispositivos moviles.


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


## 📡 API Reference para porcesos batch.

#### Endpoint para Cuentas Anuales (Retorna solo el id de la cuenta)
```bash
curl -X GET http://localhost:8092/api/bff-mobile/annual-account
```

#### Endpoint para Intereses (Retorna el nombre del cliente y el balance)
```bash
curl -X GET http://localhost:8092/api/bff-mobile/interest
```

#### Endpoint Transacciones (Retorna solo las transacciones de tipo 'invalid')
```bash
curl -X GET http://localhost:8092/api/bff-mobile/invalid-transaction
```


## 🔗 Link
[![Github](https://img.shields.io/badge/github-000000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/nisiara/dbe3_exp2_s1_bff_mobile.git)