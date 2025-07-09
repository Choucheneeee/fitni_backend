


# Fitni Backend

Fitni is a comprehensive fitness and nutrition management system built with Spring Boot and MongoDB. The backend provides RESTful APIs to manage nutrition plans, user profiles, and administrative functions.

## Project Overview

This project serves as the backend infrastructure for the Fitni application, providing:
- Nutrition plan management
- User authentication and authorization
- Administrative controls
- Athlete profile management

## Technology Stack

- Java Spring Boot
- MongoDB
- Maven
- Spring Security
- Lombok

## Project Structure

```plaintext
fitni_backend/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/developers/fitni_backend/
│   │   └── resources/
│   └── test/
└── pom.xml
```

## .env 
    MONGO_URI=mongodb+srv://YOURNAME:YOURPASSWORD@DATABASE.7pinlgl.mongodb.net/******?retryWrites=true&w=majority&appName=******
    Port=PORT BY DEFAULT 8080
## Getting Started

1. Prerequisites:
   - Java 17 or higher
   - Maven
   - MongoDB

2. Environment Setup:
   - Configure MongoDB connection in `.env` file
   - Default port: 8080

3. Build and Run:
```bash
mvn clean install
mvn spring-boot:run
```

## API Documentation

The API documentation will be available at `http://localhost:8081/swagger-ui.html` when the application is running.

## License

Proprietary License

This software and its source code are proprietary and confidential. No part of this software may be reproduced, distributed, or transmitted in any form or by any means without the prior written permission of the development team.

### Development Team

This project is exclusively maintained by:
- Khalil Sfaxi
- Sami Abdelhafidh
- Chouchene Med Amine

© 2024 Fitni Development Team. All rights reserved.

## Contact

For any inquiries about this project, please contact the development team members listed above.

---
**Note**: This is a private repository and should not be shared or distributed without explicit permission from the development team.



        