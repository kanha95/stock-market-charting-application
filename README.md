# Stock Market Microservices Application

This repository contains a microservices-based application for managing stock market-related operations. Each service is responsible for a specific domain, such as company information, sector information, stock exchange, etc. The project includes an Angular frontend for user interaction and a Jenkins pipeline for continuous integration and deployment.

---

## **Repository Structure**

### **Frontend**
1. **`Angular/`**
   - Contains the Angular frontend for the application.
   - User-friendly interface for managing and displaying stock market data.
   - Updated to version 2 for improved features and compatibility.

### **Backend Microservices**
Each microservice handles a distinct functionality within the application:
1. **`company-info-service/`**
   - Manages data related to companies listed on the stock exchange.
   - Includes endpoints for CRUD operations on company information.

2. **`sector-info-service/`**
   - Manages sector-related data.
   - Provides APIs to fetch and manipulate sector information.

3. **`stock-exchange-service/`**
   - Handles data and operations related to stock exchanges.
   - Includes APIs for fetching stock exchange details and performing relevant operations.

4. **`excel-service/`**
   - Handles the import and export of data in Excel format.
   - Facilitates data uploads and downloads for better management.

5. **`login-service/`**
   - Manages authentication and user login.
   - Includes functionality for user validation and session management.

6. **`discovery-server/`**
   - Acts as a service discovery server.
   - Helps in identifying and routing requests to the appropriate microservices.

---

### **Configuration and Other Files**
1. **`.project`**
   - Basic templating for the project, initialized during the first commit.

2. **`Jenkins-pipeline`**
   - Configuration for the Jenkins pipeline to automate the build, test, and deployment process.
   - Streamlines continuous integration and deployment (CI/CD).

---

## **Setup Instructions**

### **1. Clone the Repository**
```bash
git clone <repository_url>
cd <repository_folder>
```

### **2. Prerequisites**
- **Frontend:**
  - Angular CLI installed (`npm install -g @angular/cli`).
  - Node.js and npm installed.
- **Backend:**
  - Java (JDK 8 or above).
  - Maven for building microservices.
  - Spring Boot framework for running services.
- **Database:**
  - Relational database (e.g., MySQL or PostgreSQL) for storing application data.
- **Service Discovery:**
  - Eureka server for service discovery.

### **3. Build and Run**
#### **Frontend**
1. Navigate to the Angular directory:
   ```bash
   cd Angular
   ```
2. Install dependencies:
   ```bash
   npm install
   ```
3. Run the application:
   ```bash
   ng serve
   ```
4. Access the application at `http://localhost:4200`.

#### **Backend**
1. Navigate to each microservice folder (e.g., `company-info-service`) and build:
   ```bash
   mvn clean install
   ```
2. Run the services:
   ```bash
   java -jar target/<service-name>.jar
   ```

#### **Service Discovery**
1. Navigate to the `discovery-server` folder and build:
   ```bash
   mvn clean install
   ```
2. Run the discovery server:
   ```bash
   java -jar target/discovery-server.jar
   ```

### **4. Jenkins Pipeline**
- Set up a Jenkins pipeline using the configuration file (`Jenkins-pipeline`) to automate the build and deployment process.

---

## **Key Features**
- **Modular Design:** Each service operates independently, ensuring flexibility and scalability.
- **Angular Frontend:** Provides an intuitive interface for users.
- **Excel Integration:** Allows easy import and export of data.
- **Service Discovery:** Facilitates smooth communication between services.
- **CI/CD Pipeline:** Automated Jenkins pipeline for continuous integration and deployment.

---

## **Future Enhancements**
- Implement advanced analytics for stock market data.
- Add user role management for restricted access to specific services.
- Optimize performance for high data volumes.

---

## **License**
This project is licensed under the MIT License.

---
