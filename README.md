# 🌱 spring-task-hub

A lightweight Spring Boot microservice for managing and assigning tasks. Built using a custom OpenAPI-driven development approach for rapid prototyping and clean code structure.

---

## 🔧 Built With

- **Java 17**
- **Spring Boot** (via [`fast-openapi-generator-maven-plugin`](https://github.com/YOUR_USERNAME/fast-openapi-generator-maven-plugin))
- **OpenAPI 3**
- **Maven**
- **Docker**

---

## 📦 Features

- Auto-generated boilerplate using [fast-openapi-generator-maven-plugin](https://github.com/YOUR_USERNAME/fast-openapi-generator-maven-plugin):
    - Generates `@RestController` annotated controller classes
    - Generates service interfaces that are auto-injected into the controller
    - Eliminates repetitive configuration and speeds up development
- Docker support for containerized deployment
- Includes a ready-to-use Postman collection to test APIs quickly

---

## 🚀 Getting Started

### 1️⃣ Clone the repository

```bash
git clone https://github.com/YOUR_USERNAME/spring-task-hub.git
cd spring-task-hub
```

### 2️⃣ Build the project with Maven

```bash
mvn clean install
```

### 3️⃣ Build the Docker image
```bash
docker build -t spring-task-hub .
```

specify the platform if needed as shown below:

```bash
docker build -t spring-task-hub . --platform linux/arm64/v8
```

### 4️⃣ Run the service using Docker Compose

```bash
docker-compose up
```

## 📬 API Documentation
This project follows the OpenAPI 3 specification.

All endpoints are generated using the custom OpenAPI generator.
A Postman collection is provided to simplify API exploration and testing.
### How to Use:
- Open Postman.
- Import the collection from postman/spring-task-hub.postman_collection.json.
- Run requests against your locally running service (e.g., http://localhost:8081).

## 🧪 What's Next?

Planned improvements:

- Containerized testing using TestContainers
    - Launch the service in a lightweight container during tests
    - Run integration or unit tests against a live instance using a dedicated TestApplication
    - Improve CI/CD readiness with isolated test environments

## 🧰 Project Structure
```css
spring-task-hub/
├── src/
│   ├── main/
│   │   ├── java/
│   │   └── resources/
│   ├── test/
├── target/
├── Dockerfile
├── docker-compose.yml
├── postman/
│   └── spring-task-hub.postman_collection.json
└── pom.xml
```

## 📄 License
This project is licensed under the Apache License.
Feel free to use, modify, and distribute it under the terms of the license.