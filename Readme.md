REST API для отслеживания дневной нормы калорий и учета питания

Этот проект представляет собой REST API сервис, предназначенный для отслеживания дневной нормы калорий пользователя, учета съеденных блюд и формирования отчетов по питанию. Сервис построен с использованием Spring Boot и Spring Data JPA. В качестве базы данных используется PostgreSQL

Как запустить:

Клонировать репозиторий

Настроить файл конфигурации application.properties для подключения к базе данных PostgreSQL:  
spring.datasource.url=jdbc:postgresql://localhost:5432/calorie_tracker_db  
spring.datasource.username=your_username  
spring.datasource.password=your_password  
spring.jpa.hibernate.ddl-auto=create  
spring.jpa.show-sql=true  

Запустить приложение

Приложение будет доступно по умолчанию на порту 8080.