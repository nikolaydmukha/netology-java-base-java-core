package home.netology.javacore.patterns.creational.prototype;

public class Circle extends Shape{
    public int radius;

    public Circle(){

    }

    public Circle(Circle circle){
        super(circle);
        if (circle != null) {
            this.radius = circle.radius + 10;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

}
