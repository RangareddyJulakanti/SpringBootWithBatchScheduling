# SpringBootWithBatchScheduling

# Add oracle database credenttials like the below

spring.datasource.url=jdbc:oracle:thin:@localhost:1521:XE
spring.datasource.username=system
spring.datasource.password=system
spring.datasource.driver-class-name=oracle.jdbc.driver.OracleDriver
#server port by default 8080 if you want me can use our own port
server.port=1234
#creates tables automatically
spring.jpa.generate-ddl=true
