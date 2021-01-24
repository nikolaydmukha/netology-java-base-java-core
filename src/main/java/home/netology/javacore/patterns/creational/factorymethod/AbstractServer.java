package home.netology.javacore.patterns.creational.factorymethod;

public abstract class AbstractServer {

    protected abstract ILog getLog();

    public void doWork(){
        ILog logger = getLog();
        logger.log("Log init");
    }
}
