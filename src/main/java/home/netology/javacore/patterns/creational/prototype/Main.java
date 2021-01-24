package home.netology.javacore.patterns.creational.prototype;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";


        Circle anotherCircle = (Circle) circle.clone();
        Circle thirdCircle = (Circle) anotherCircle.clone();

        System.out.println(circle.radius);
        System.out.println(anotherCircle.radius);
        System.out.println(thirdCircle.radius);

        Rectangle rectangle = new Rectangle();
        rectangle.x1 = 0;
        rectangle.y1 = 0;
        rectangle.x2 = 10;
        rectangle.y2 = 10;

        Rectangle anotherRectangle = rectangle.clone();
        System.out.println(anotherRectangle.x1);
        System.out.println(anotherRectangle.y1);
        System.out.println(anotherRectangle.x2);
        System.out.println(anotherRectangle.y2);
    }
}
