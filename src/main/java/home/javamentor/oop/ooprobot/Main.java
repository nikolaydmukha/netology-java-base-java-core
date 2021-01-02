package main.java.home.javamentor.oop.ooprobot;

public class Main {
    public static void main(String[] args) {

        Robot robot = new Robot();
        moveRobot(robot, 10, 10);
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        //Твой код здесь
        int currentPositionX = robot.getX();
        int currentPositionY = robot.getY();
        System.out.println("111" + robot.getDirection());
        if (robot.getDirection() == Robot.Direction.UP) {
            if (toX < robot.getX()) {
                robot.turnLeft();
                steps(toX, robot);
                if (toY < robot.getY()) {
                    robot.turnLeft();
                    steps(toY, robot);
                }
                if (toY > robot.getY()) {
                    robot.turnRight();
                    steps(toY, robot);
                }
            } else if (toX > robot.getX()) {
                robot.turnRight();
                steps(toX, robot);
                if (toY > robot.getY()) {
                    robot.turnRight();
                    steps(toY, robot);
                } else if (toY < robot.getY()) {
                    robot.turnRight();
                    steps(toY, robot);
                }
            }
        } else if (robot.getDirection() == Robot.Direction.DOWN) {
            if (toX < robot.getX()) {
                robot.turnRight();
                steps(toX, robot);
                if (toY < robot.getY()) {
                    robot.turnLeft();
                    steps(toY, robot);
                }
                if (toY > robot.getY()) {
                    robot.turnRight();
                    steps(toY, robot);
                }
            } else if (toX > robot.getX()) {
                robot.turnLeft();
                steps(toX, robot);
                if (toY > robot.getY()) {
                    robot.turnLeft();
                    steps(toY, robot);
                } else if (toY < robot.getY()) {
                    robot.turnRight();
                    steps(toY, robot);
                }
            }
        } else if (robot.getDirection() == Robot.Direction.LEFT) {
            if (toX < robot.getX()) {
                steps(toX, robot);
                if (toY < robot.getY()) {
                    robot.turnLeft();
                    steps(toY, robot);
                }
                if (toY > robot.getY()) {
                    robot.turnRight();
                    steps(toY, robot);
                }
            } else if (toX > robot.getX()) {
                robot.turnRight();
                robot.turnRight();
                steps(toX, robot);
                if (toY > robot.getY()) {
                    robot.turnLeft();
                    steps(toY, robot);
                } else if (toY < robot.getY()) {
                    robot.turnRight();
                    steps(toY, robot);
                }
            }
        } else if (robot.getDirection() == Robot.Direction.RIGHT) {
            if (toX < robot.getX()) {
                robot.turnLeft();
                robot.turnLeft();
                steps(toX, robot);
                if (toY < robot.getY()) {
                    robot.turnLeft();
                    steps(toY, robot);
                }
                if (toY > robot.getY()) {
                    robot.turnRight();
                    steps(toY, robot);
                }
            } else if (toX > robot.getX()) {
                steps(toX, robot);
                if (toY > robot.getY()) {
                    robot.turnLeft();
                    steps(toY, robot);
                } else if (toY < robot.getY()) {
                    robot.turnRight();
                    steps(toY, robot);
                }
            }
        }

    }

    private static void steps(int step, Robot robot) {
        for (int i = 0; i <= step; i++) {
            System.out.println("Move to " + step);
            robot.stepForward();
        }
    }
}
