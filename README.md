# AllerGo - Smart Allergy Management App

## App Name: AllerGo

## Slogan: Eat Smart. Stay Safe.

## Overview
AllerGo is a mobile application designed to help individuals with food allergies dine out safely. The app combines traditional features with AI-powered functionality to provide a comprehensive solution for managing food allergies.

## Core Features

### Non-AI Features
1. User Allergy Profile
   - Users can select and manage their specific food allergies
2. Restaurant Listings & Filters
   - Search for nearby restaurants with allergy-friendly options
3. Allergy Card Generator
   - Create personalized allergy cards in multiple languages
4. Community Reviews
   - Share and read reviews about restaurant allergy safety

### AI-Powered Features
1. AI Menu Scanner
   - Uses OCR and NLP to read and analyze restaurant menus
   - Cross-checks menu items against user's allergy profile
   - Flags potentially unsafe dishes
2. AI-Powered Dish Recommender
   - Learns from user's eating history and preferences
   - Suggests safe meal options from nearby restaurants
   - Prioritizes highly-rated allergy-safe dishes

## Technical Stack
- Java EE (Jakarta EE)
- JPA/Hibernate
- Maven
- H2 Database
- RESTful API

## Project Structure
```
src/main/java/
├── com.allergo
│   ├── model/           # Entity classes
│   ├── service/         # Business logic
│   ├── repository/      # Data access
│   └── controller/      # REST controllers
```

## Getting Started

### Prerequisites
- Java 17 or higher
- Maven 3.8 or higher
- Application Server (e.g., Tomcat, WildFly)

### Building the Project
```bash
mvn clean install
```

### Running the Application
```bash
mvn tomcat7:run
```

## Contributing
Please read CONTRIBUTING.md for details on our code of conduct and the process for submitting pull requests.

## License
This project is licensed under the MIT License - see the LICENSE file for details.
