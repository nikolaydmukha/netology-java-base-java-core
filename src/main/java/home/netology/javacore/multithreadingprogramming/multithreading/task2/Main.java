package home.netology.javacore.multithreadingprogramming.multithreading.task2;

import com.google.common.util.concurrent.ThreadFactoryBuilder;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {

        final ThreadFactory threadFactory = new ThreadFactoryBuilder()
                .setNameFormat("Поток-%d")
                .setDaemon(true)
                .build();
        //Получаем ExecutorService утилитного класса Executors с размером пула потоков равному 10
        ExecutorService executor = Executors.newFixedThreadPool(4, threadFactory);
        //создаем список с Future, которые ассоциированы с Callable
        List<Future<String>> list = new ArrayList<>();
        // создаем экземпляр CallableClass
        Callable<String> callable = new CallableClass();
        for(int i=0; i< 40; i++){
            //сабмитим Callable таски, которые будут
            //выполнены пулом потоков
            Future<String> future = executor.submit(callable);
            //добавляя Future в список,
            //мы сможем получить результат выполнения
            list.add(future);
        }
        for(Future<String> fut : list){
            try {
                // печатаем в консоль возвращенное значение Future
                // будет задержка в 1 секунду, потому что Future.get()
                // ждет пока таск закончит выполнение
                System.out.println(new Date()+ "::" + fut.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        executor.shutdown();
    }
}
