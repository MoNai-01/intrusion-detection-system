# Intrusion Detection System (Spring Boot)

A Dockerized web application that detects and alerts on security threats (XSS, SQLi, etc.) with email notifications.

## Features
- Real-time attack detection (XSS, SQL Injection)
- Email alerts via SMTP
- H2 database with persistent storage
- Spring Boot 3.4 + Java 21

## Prerequisites
- Docker
- JDK 21+
- Maven 3.9+

## Quick Start

# 1. Clone the repository
```bash
git clone https://github.com/MoNai-01/intrusion-detection-system.git
cd intrusion-detection-system
```

# 2. Build and run with Docker
```bash
docker build -t ids .
docker run -p 8081:8081 \
  -e SMTP_HOST=smtp.gmail.com \
  -e SMTP_USER=your-test-email@gmail.com \
  -e SMTP_PASSWORD=your-app-password \
  ids

# Use Gmail "App Password"
# Or use temporary email service like Mailtrap.io
```

# 3. Acces the web app 
- Login page: http://localhost:8081/http-request/
- Logs: http://localhost:8081/logs/
