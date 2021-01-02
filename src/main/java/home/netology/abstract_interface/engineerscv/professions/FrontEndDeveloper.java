package main.java.home.netology.abstract_interface.engineerscv.professions;

import main.java.home.netology.abstract_interface.engineerscv.Engineer;
import main.java.home.netology.abstract_interface.engineerscv.skills.*;

public class FrontEndDeveloper extends Engineer implements ICSS, IHTML, IGIT, IJavaScript {
    public FrontEndDeveloper(String name, int age, String country) {
        super(name, age, country);
    }

    @Override
    public void gitPush() {
        System.out.println("FrontEndDev make push");
    }

    @Override
    public void advancedGit() {
        System.out.println("Learn more git features - advanced level");
    }

    @Override
    public void bootstrap(){
        System.out.println("FrontEndDev learn the last BootStrap version");
    }

    @Override
    public void learnJavaScript() {
        System.out.println("FrontEndDev is learning JavaScript deep");
    }
}
