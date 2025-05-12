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
```bash
# 1. Clone the repository
git clone https://github.com/yourusername/intrusion-detection-system.git
cd intrusion-detection-system

# 2. Build and run with Docker
docker build -t ids .
docker run -p 8081:8081 \
  -e SMTP_HOST=smtp.gmail.com \
  -e SMTP_USER=your-test-email@gmail.com \
  -e SMTP_PASSWORD=your-app-password \
  ids

# Use Gmail "App Password"
# Or use temporary email service like Mailtrap.io
