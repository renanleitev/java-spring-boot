# MyApp

Aplicação criada com uso do [Bootify.io](https://bootify.io/next-steps/).

## Rodando a aplicação

Para rodar a aplicação, basta executar o arquivo principal MyAppApplication.

    src/main/java/io/bootify/my_app/MyAppApplication.java

## Swagger

Acesse o Swagger pelo seguinte endereço:

    http://localhost:8080/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config#/

## Banco de Dados H2

Acesse o banco de dados H2 pelo seguinte endereço:

    http://localhost:8080/h2-console/

Verifique as seguintes configurações:

JDBC URL: 

    jdbc:h2:mem:my-app

User Name:

    sa

## Configurações Originais

### Development

During development it is recommended to use the profile `local`. 

In IntelliJ, `-Dspring.profiles.active=local` can be added in the VM options of the Run Configuration after enabling this property in "Modify options".

Update your local database connection in `application.yml` or create your own `application-local.yml` file to override settings for development.

After starting the application it is accessible under `localhost:8080`.

### Build

The application can be built using the following command:

```
mvnw clean package
```

The application can then be started with the following command - here with the profile `production`:

```
java -Dspring.profiles.active=production -jar ./target/my-app-0.0.1-SNAPSHOT.jar
```

### Further readings

* [Maven docs](https://maven.apache.org/guides/index.html)  
* [Spring Boot reference](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)  
* [Spring Data JPA reference](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/)  
