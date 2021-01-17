# CSV - JSON парсер

*Описание*

Для работы с проектом потребуются вспомогательные библиотеки, поэтому необходимо создать новый проект с использованием
сборщика проекта `Gradle` или `Maven`. Далее пропишите зависимости для следующих библиотек: `opencsv`, `json-simple`
и `gson`. Ниже приведен пример для сборщика `Gradle`:

```gradle
compile 'com.opencsv:opencsv:5.1'
compile 'com.googlecode.json-simple:json-simple:1.1.1'
compile 'com.google.code.gson:gson:2.8.2'
```

В качестве исходной информации создайте файл `data.csv` со следующим содержимым и поместите его в корень созданного
проекта:

```csv
1,John,Smith,USA,25
2,Inav,Petrov,RU,23
```

Помимо этого потребуется класс `Employee`, который будет содержать информацию о сотрудниках. Обратите внимание, что для
парсинга Java классов из CSV потребуется пустой конструктор класса.

```java
public class Employee {
    public long id;
    public String firstName;
    public String lastName;
    public String country;
    public int age;

    public Employee() {
        // Пустой конструктор
    }

    public Employee(long id, String firstName, String lastName, String country, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.age = age;
    }
}
``` 

В результате работы программы в корне проекта должен появиться файл `data.json` со следующим содержимым:

```json
[
  {
    "id": 1,
    "firstName": "John",
    "lastName": "Smith",
    "country": "USA",
    "age": 25
  },
  {
    "id": 2,
    "firstName": "Ivan",
    "lastName": "Petrov",
    "country": "RU",
    "age": 23
  }
]
```
