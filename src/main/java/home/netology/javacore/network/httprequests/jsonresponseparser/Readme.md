# Запрос на получение списка фактов о кошках

*Описание*

По адресу http://jsonplaceholder.typicode.com/comments находится список комментариев. Наша задача - сделать запрос к
этому ресурсу и отфильтровать комментарии, например, по ```postId```. Формат каждой записи следующий:

```json
{
  "postId": 1,
  "id": 1,
  "name": "id labore ex et quam laborum",
  "email": "Eliseo@gardner.biz",
  "body": "laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium"
}
```

## Реализация

1. Перед тем как начать откройте url http://jsonplaceholder.typicode.com/comments в браузере и посмотрите на данные;
2. Создайте проект `maven` или `gradle` и добавьте в pom.xml или gradle.build библиотеку apache httpclient Пример:

```text
<dependency>
   <groupId>org.apache.httpcomponents</groupId>
   <artifactId>httpclient</artifactId>
   <version>4.5.12</version>
</dependency>
```

3. Создайте метод в который добавьте и настройте класс `CloseableHttpClient` например с помощью builder

```text
CloseableHttpClient httpClient = HttpClientBuilder.create()
    .setDefaultRequestConfig(RequestConfig.custom()
        .setConnectTimeout(5000)    // максимальное время ожидание подключения к серверу
        .setSocketTimeout(30000)    // максимальное время ожидания получения данных
        .setRedirectsEnabled(false) // возможность следовать редиректу в ответе
        .build())
    .build();
```

4. Добавьте объект запроса HttpGet request = new HttpGet("http://jsonplaceholder.typicode.com/comments") и вызовите удаленный
   сервис `CloseableHttpResponse response = httpClient.execute(request)`;
5. Добавьте в pom.xml или gradle.build библиотеку для работы с json Пример:

```text
<dependency>
   <groupId>com.fasterxml.jackson.core</groupId>
   <artifactId>jackson-databind</artifactId>
   <version>2.11.1</version>
</dependency>
```

6. Создайте класс, в который будем преобразовывать json ответ от сервера;
7. Преобразуйте json в список java объектов;
8. Отфильтруйте список - например, средствами stream api
9. Выведите результат на экран;
10. Отправьте задачу на проверку.
