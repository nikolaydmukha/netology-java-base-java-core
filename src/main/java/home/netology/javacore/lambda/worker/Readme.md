# Работяга

*Описание*
В данной задаче вам необходимо реализовать класс `Worker`, который будет выполнять некоторые задачи и возвращать
результат в родительский класс `Main`.

```java
public class Worker {

}
```

Для того, чтобы класс `Worker` мог вернуть резлультат своей работы, реализуйте собственный функциональный интерфейс
`OnTaskDoneListener`. В нем определите только один метод `onDone()` без реализации и пометьте интерфейс
аннотацией `@FunctionalInterface`:

```java

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
```

Добавьте в класс `Worker` переменную `callback` типа `OnTaskDoneListener`:

```java
private OnTaskDoneListener callback;
```

Передайте в класс `Worker` ее значение через конструктор:

```java
public Worker(OnTaskDoneListener callback){
        this.callback=callback;
        }
```

Смоделируйте выполнение классом `Worker` какой-либо работы, например:

```java
public void start(){
        for(int i=0;i< 100;i++){
        callback.onDone("Task "+i+" is done");
        }
        }
```

Обратите внимание на то, что каждая итерация цикла означает выполнение задачи, результат который передается через метод
`onDone()` функционального интерфейса `OnTaskDoneListener`.
