# ticker-spring-data-jpa
A basic application that stores and retrieves stock prices using Spring Data JPA

To POST data
```
curl --data "id=MSFT&price=43" url/stock
```

To GET data
```
curl http://localhost:8080/stock?id=MSFT
```
