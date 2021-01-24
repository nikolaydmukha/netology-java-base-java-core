package home.netology.javacore.patterns.creational.prototype;

public class Rectangle {
    public int x1;
    public int y1;
    public int x2;
    public int y2;

    public Rectangle() {

    }

    public Rectangle(Rectangle rect) {
        if (rect != null) {
            this.x1 = rect.x1 + 10;
            this.y1 = rect.y1 + 10;
            this.x2 = rect.x2 + 10;
            this.y2 = rect.y2 + 10;
        }
    }

    public Rectangle clone() {
        return new Rectangle(this);
    }
}
