package home.netology.javacore.patterns.creational.abstractfabric.eng;


import home.netology.javacore.patterns.creational.abstractfabric.ErrorMessenger;

public class EngErrorMessenger implements ErrorMessenger {
    @Override
    public void print(int errorCode) {
        System.out.println("There is was an error ".concat(String.valueOf(errorCode)));
    }
}
