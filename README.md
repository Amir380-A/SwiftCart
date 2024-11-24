# SwiftCart

SwiftCart is an e-commerce platform built with a focus on performance, security, and scalability. The application offers robust user management, product catalog, and order processing functionalities. It is designed to be flexible, allowing integration with third-party services and easy deployment.

## Tech Stack

- **Backend Framework**: [Spring Boot](https://spring.io/projects/spring-boot)
- **Database**: [Redis](https://redis.io/) for caching and [MySQL](https://www.mysql.com/) for data storage
- **Frontend**: React (Frontend can be developed and connected via REST APIs)
- **API Security**: OAuth2 for third-party authentication, CSRF protection, CORS configuration, and Content Security Policy (CSP) for security headers
- **Build Tool**: [Maven](https://maven.apache.org/)
- **Containerization**: Docker for containerized deployment
- **CI/CD**: GitHub Actions for continuous integration and deployment pipelines

## Features

- **User Authentication**: Secure login via Google and GitHub OAuth2
- **Product Catalog**: Manage products with CRUD functionality
- **Order Management**: Track and manage user orders
- **Caching**: Redis for optimizing data access speed
- **Security**: Best practices for securing APIs with JWT or OAuth2, CORS, CSP, and headers to prevent attacks
- **Metrics**: Prometheus and Spring Actuator for monitoring and metrics collection

## Getting Started

To get started with this project, follow the steps below:

### Prerequisites

- [Java 17](https://openjdk.java.net/projects/jdk/17/)
- [Docker](https://www.docker.com/)
- [Maven](https://maven.apache.org/)
- [Redis](https://redis.io/)
- [MySQL](https://www.mysql.com/)
- [Git](https://git-scm.com/)

### Setup

1. Clone the repository:
   ```bash
   git clone https://github.com/Amir380-A/SwiftCart.git


## Setup

### Set up Environment Variables

To configure the necessary environment variables, follow these steps:

1. **Create a `.env` file** at the root of your project directory. This file will store sensitive information and configuration settings for your application.

2. **Add required variables** to the `.env` file. You can include your database configurations, OAuth credentials, and other secret keys. Example:

    ```env
    SPRING_DATASOURCE_URL=jdbc:mysql://localhost:3306/swiftcart
    SPRING_DATASOURCE_USERNAME=root
    SPRING_DATASOURCE_PASSWORD=yourpassword
    SPRING_OAUTH2_GOOGLE_CLIENT_ID=your-google-client-id
    SPRING_OAUTH2_GOOGLE_CLIENT_SECRET=your-google-client-secret
    SPRING_OAUTH2_GITHUB_CLIENT_ID=your-github-client-id
    SPRING_OAUTH2_GITHUB_CLIENT_SECRET=your-github-client-secret
    ```

3. **run the services with Docker 
```
docker-compose up --build

```
