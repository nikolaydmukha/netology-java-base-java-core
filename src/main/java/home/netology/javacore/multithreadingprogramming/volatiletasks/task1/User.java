package home.netology.javacore.multithreadingprogramming.volatiletasks.task1;

public class User extends Thread {

    private static int SLEEP_TIME = 2000;
    private Switcher switcher;

    public User(Switcher switcher) {
        this.switcher = switcher;
    }

    @Override
    public void run() {
        if (switcher.getButtonStatus().equals("Off")) {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(SLEEP_TIME);
                    switcher.setButtonStatus("On");
                    System.out.println(Thread.currentThread().getName() + " перевёл тумблер в положение On.");
                } catch (InterruptedException iex) {
                    System.out.println(Thread.currentThread().getName() + " прерван.");
                }
            }
        }
    }
}
