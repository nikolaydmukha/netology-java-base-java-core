package main.java.home.netology.collections.queuecollection.elevator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> elevatorWay = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Ожидаю ввода этажа: (для завершения введите 0)");
            try {
                int floor = scanner.nextInt();
                if (floor < 0 || floor > 25) {
                    throw new InputMismatchException();
                } else if (floor == 0) {
                    elevatorWay.offer(floor);
                    break;
                }
                elevatorWay.offer(floor);
            } catch (InputMismatchException ex) {
                scanner.nextLine();
                System.out.println("Нужно ввести число, и оно должно быть от 0 до 25");
            }
        }
        elevatorWay(elevatorWay);
        System.out.println("Время, затраченное на маршрут, " + elevatorTimeSpended(elevatorWay) + " сек");

    }

    private static int elevatorTimeSpended(Queue<Integer> elevatorWay) {
        int time = 0;
        List<Integer> elevatorFloorList = new ArrayList<>(elevatorWay);
        int a = elevatorFloorList.get(0);
        for (int i = 1; i < elevatorFloorList.size(); i++){
            int b = elevatorFloorList.get(i);
            time += Math.abs(b - a) * 5 + 20;
            a = b;
        }
        return time;
    }

    private static void elevatorWay(Queue<Integer> elevatorWay) {
        System.out.println("Лифт проследовал по следующим этажам:");
        StringBuilder stringBuilder = new StringBuilder();

        Iterator<Integer> it = elevatorWay.iterator();
        while (it.hasNext()) {
            stringBuilder.append("этаж " + it.next() + " -> ");

        }
        System.out.println(stringBuilder.delete(stringBuilder.length() - 3, stringBuilder.length()));
    }
}
