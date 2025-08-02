# 🛒 MarketplaceLite

A simple Java-based e-commerce backend application using Spring Boot.

## 📦 Features

- User registration (with password encoding)
- Product management
- Order creation (multi-product)
- Basic security (Spring Security)
- H2 in-memory database

## 🚀 Technologies

- Java 17+
- Spring Boot
- Spring Data JPA
- Spring Security
- H2 Database
- Lombok

## 🛠️ Running the App

```bash
./mvnw spring-boot:run
```

Visit: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)

## 🧪 API Endpoints

- `POST /api/auth/register`
- `GET /api/products`
- `POST /api/products`
- `POST /api/orders`

> Basic Auth (for now). Use Swagger or Postman to test.
