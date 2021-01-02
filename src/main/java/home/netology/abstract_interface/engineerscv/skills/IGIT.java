package main.java.home.netology.abstract_interface.engineerscv.skills;

public interface IGIT {
    default void gitPush() {
        System.out.println("Make push");
    }

    default void gitPull() {
        System.out.println("Make pull");
    }

    default void gitFetch() {
        System.out.println("Make fetch");
    }

    default void gitCommit() {
        System.out.println("Make commit");
    }

    default void gitMerge() {
        System.out.println("Make merge");
    }

    default void gitCheckout() {
        System.out.println("Make checkout");
    }

    void advancedGit();

}
