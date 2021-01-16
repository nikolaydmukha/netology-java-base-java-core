package home.netology.customutils.commons;

public class Tiger extends Cat implements CatsMethods {

    @Override
    public void makeRun() {
        System.out.println("Бежит тигр");
        ;
    }

    @Override
    void getType() {
        System.out.println("Тигр");
    }
}
