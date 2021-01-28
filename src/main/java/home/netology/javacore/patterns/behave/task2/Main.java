package home.netology.javacore.patterns.behave.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<FrogCommands> commands = new ArrayList<>();
        Frog frog = new Frog();
        FrogCommands tmp = null;
        int curCommand = -1;
        while (true) {
            System.out.println(curCommand);
            String action = getAction(scanner);
            if (action.equals("<<")) {
                if (curCommand < 0) {
                    System.out.println("Нечего отменять!");
                } else {
                    commands.get(curCommand).undoAction();
                    tmp = commands.get(curCommand);
                    commands.remove(curCommand);
                    curCommand--;
                }
            } else if (action.equals(">>")) {
                if (tmp != null) {
                    commands.add(tmp);
                    tmp.doAction();
                    tmp = null;
                    curCommand++;
                } else {
                    System.out.println("Нечего повторять!");
                }
            } else if (action.equals("!!")) {
                commands.get(curCommand).doAction();
                commands.add(commands.get(curCommand));
                curCommand++;
            } else {
                int steps = Integer.valueOf(action);
                FrogCommands cmd = new FrogCommands(frog, steps);
                commands.add(cmd);
                cmd.doAction();
                curCommand++;
            }
            //рисуем поле после команды
            System.out.println("Текущая позиция: " + frog.position);
        }
    }

    private static String getAction(Scanner scanner) {
        String action = "";
        while (true) {
            System.out.println(
                    "* +N - прыгни на N шагов направо\n" +
                            "* -N - прыгни на N шагов налево\n" +
                            "* << - Undo (отмени последнюю команду)\n" +
                            "* >> - Redo (повтори отменённую команду)\n" +
                            "* !! - повтори последнюю команду\n" +
                            "* 0 - выход");
            //считываем ввод и конструируем команду, если
            //пользователь не хотел выйти
            action = scanner.nextLine();
            try {
                Integer.parseInt(action);
                return action;
            } catch (NumberFormatException e) {
                if (action.equals("<<") || action.equals(">>") || action.equals("!!")) {
                    break;
                }
                continue;
            }
        }
        return action;
    }
}
