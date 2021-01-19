# Использование JUnit. Task 1

*Описание*

В этом задании научимся писать тесты с использованием библиотеки для модульного тестирования **JUnit**

Выберите одно или несколько ваших любимых домашних заданий, которые вы уже сделали. Вспомните, как вы тестировали его
работоспособность. Наверняка просто запускали и вводили какие-то данные вручную?

А теперь добавьте модульные тесты, которые проверят работоспособность автоматически. Тестов должно быть не менее трёх.

П.С. После того, как тесты есть, вы можете попробовать улучшить (отрефакторить) ваш основной код. Поверьте, вы
почувствуете это приятное ощущение уверенности в своём коде!
И, изменив что-то, сможете в любой момент за пару секунд убедиться, что всё по-прежнему работает

## Реализация

Подключите зависимость к любимой системе сборки. Maven:

```xml

<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-engine</artifactId>
    <version>5.1.0</version>
    <scope>test</scope>
</dependency>
```

Или Gradle:

```gradle
dependencies {
  // .. другие зависимости
  testImplementation('org.junit.jupiter:junit-jupiter:5.6.2')
}

test {
  useJUnitPlatform()
}
```

Создайте класс для тестов в папке `src/test/java` (можете также создать подпапки в соответствии с package'ом класса,
который вы будете тестировать)

В классе создайте методы вида:

```java
@org.junit.jupiter.api.Test
public void testConcat_validArgument_success(){
        // given:
        ...

        // when:
        ...

        // then:
        Assertions.***;
        }
```

где на месте `...` размещаете код подготовки к тестированию, а затем вызова целевого метода.  
А набрав `Assertions.` выберите подходящий метод из подсказок IntelliJ IDEA.  
Таких методов (ассертов) можете сделать несколько в одном тестирующем методе.

# "JUnit + Hamcrest". Task 2

*Описание*

Прочитайте про Hamcrest для JUnit

Перепишите ваши тесты из первого задания в стиле Hamcrest

Напишите ещё минимум 2 теста, стараясь использовать те фичи Hamcrest, которых нет в стандартных ассертах JUnit

## Реализация

Подключите зависимость к любимой системе сборки  
Maven:

```xml

<dependency>
    <groupId>org.hamcrest</groupId>
    <artifactId>hamcrest-all</artifactId>
    <version>1.3</version>
</dependency>
```

Или Gradle:

```gradle
  testCompile("org.hamcrest:hamcrest-all:1.3")
```

*Пример теста из презентации:*

```java
@Test
public void contains(){
        List<String> list=List.of("hello","netology","world");

        assertThat(list,hasItems("hello","netology"));
        }
```

Здесь `assertThat` - статический импорт из `org.hamcrest.MatcherAssert`  
А `hasItems` можете найти в `org.hamcrest.Matchers` - там же вы можете искать другие матчеры.   
Проще набрать `Matchers.`, выбрать нужный из всплывающей подсказки, а потом уже добавить статическиий импорт средствами
IntelliJ
