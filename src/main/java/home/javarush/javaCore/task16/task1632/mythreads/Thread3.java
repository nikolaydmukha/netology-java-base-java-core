package home.javarush.javaCore.task16.task1632.mythreads;

public class Thread3  extends Thread {

    @Override
    public void run() {
        while (true) {
            System.out.println("Ура");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
