# Connecto EV Charging Platform 🚀

## Full-Stack Spring Boot + HTML/JS

**Backend**: Spring Boot 3.2 + H2 + JPA  
**Frontend**: Pure HTML/CSS/JS + fetch API  
**APIs**: User auth, bookings, stations

## Quick Start ⚡

```bash
cd backend
mvn clean install
mvn spring-boot:run
```

**Backend**: http://localhost:8080  
**H2 Console**: http://localhost:8080/h2-console (jdbc:h2:mem:connecto)  
**Frontend**: Open `dashboard.html` (uses API calls)

## Test Flow ✅
```
1. signup.html → POST /api/users/register
2. connecto.html → POST /api/users/login  
3. dashboard.html → GET /api/stations → POST /api/bookings → GET /api/bookings/user/{email}
```

## APIs 📊
```
POST /api/users/register {email, password, name}
POST /api/users/login {email, password}
GET /api/stations
GET /api/stations/available
POST /api/bookings {userEmail, station, timeSlot}
GET /api/bookings/user/{email}
GET /api/bookings/user/{email}/count
```

## Production Deployment
```
1. Replace H2 → PostgreSQL/MySQL
2. Add JWT security  
3. Hash passwords (BCrypt)
4. Frontend → React/Vue
5. Dockerize
```

**Java Interview Ready** ✅

