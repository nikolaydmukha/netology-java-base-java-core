package home.javarush.javaCore.task17.task1707;


public class IMF {

    private static IMF imf;

    public static IMF getFund() {
        //add your code here - добавь код тут
        synchronized (IMF.class){
            if(imf == null){
                imf = new IMF();
                return imf;
            }
        }
        return imf;
    }

    private IMF() {
    }
}
