package home.javarush.javaCore.task12.task1226;

/* 
Лазать, летать и бегать
*/

public class Solution {

    public static void main(String[] args) {

    }

    public class Cat implements CanRun, CanClimb {
        @Override
        public void run() {

        }

        @Override
        public void climb() {

        }
    }

    public class Dog implements CanRun {
        @Override
        public void run() {

        }


    }

    public class Tiger extends Cat  {
    }

    public class Duck implements CanRun, CanFly {
        @Override
        public void run() {

        }

        @Override
        public void fly() {

        }
    }


    interface CanFly {
        void fly();
    }

    interface CanClimb {
        void climb();
    }

    interface CanRun {
        void run();
    }
}
