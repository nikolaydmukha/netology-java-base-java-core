package main.java.home.javamentor.oop.ooprobot;

public class Robot {

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public Direction getDirection() {
        // текущее направление взгляда

        return Direction.DOWN;
    }

    public int getX() {
        // текущая координата X
        return 0;
    }

    public int getY() {
        // текущая координата Y
        return 0;
    }

    public void turnLeft() {
        // повернуться на 90 градусов против часовой стрелки
    }

    public void turnRight() {
        // повернуться на 90 градусов по часовой стрелке
    }

    public void stepForward() {
        // шаг в направлении взгляда
        // за один шаг робот изменяет одну свою координату на единицу
    }
}