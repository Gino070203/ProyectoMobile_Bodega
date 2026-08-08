# Bodega Adita — Sistema de Gestión

Monorepo del proyecto móvil para negocio familiar.

## Estructura
- `BodegaAdita_Backend/` — API REST con Spring Boot 4.1.0 / Java 21
- `BodegaAdita_Frontend/` — App móvil (pendiente)

## Backend — cómo levantarlo
1. Copiar `application.properties.example` a `application.properties`
2. Configurar credenciales de PostgreSQL
3. `./mvnw spring-boot:run`