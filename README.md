# Job Demo API Web - Prins Wu

## Use technologies
* Spring Boot
* Spring MVC
* Spring Security
* Maven
* H2 Database
* JUnit
* Surefile Report
* Jacoco Code Coverage Report
* Docker
* Heroku - Cloud Platform
* Lombok

## Implement
* Use DataInitializer to init data in H2 database
* Enable spring security and setup three user(super_user, manager, operator) and their roles(SUPER_USER, MANAGER, OPERATOR) for authentication control
* Create Repositories and Controllers for CRUD functions
* Setup swagger config and RoleAllowed annotation for authorization controler
* Create JobdemoApplicationTests for integration test, it uses MvcMock to test controller apis with WithMockUser annotation
* Create Dockerfile
* Create heroku.yml, Profile for Heroku, but it got R14 error. Because the free dyno memory limit, the container will fail when startup 


### Unit Test Report 
```
mvn surefire-report:report
```

### Jacoco Code Coverage Report
```
mvn jacoco:report
```