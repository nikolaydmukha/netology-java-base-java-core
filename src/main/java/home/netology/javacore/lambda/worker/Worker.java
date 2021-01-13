package main.java.home.netology.javacore.lambda.worker;

public class Worker {

    OnTaskDoneListener callback;
    OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                errorCallback.onError("Error in task " + i);
            }
            callback.onDone("Task " + i + " is done");
        }
    }

}
