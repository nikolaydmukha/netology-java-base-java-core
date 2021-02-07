package home.netology.javacore.multithreadingprogramming.multithreading.task2;

import java.util.concurrent.Callable;

class CallableClass implements Callable<String>
{
    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        // возвращает имя потока, который выполняет callable таск
        int i;
        for(i = 0; i < 5; i ++){
            Thread.sleep(1);
            System.out.println(Thread.currentThread().getName() + " сообщение " + i);
        }
        return Thread.currentThread().getName() + " вывел " + i + " сообщений.";
    }
}
