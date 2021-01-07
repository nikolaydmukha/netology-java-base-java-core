package main.java.home.netology.collections.treemap.phonebook;

import main.java.home.netology.collections.treemap.phonebook.notes.MissedCallsBook;
import main.java.home.netology.collections.treemap.phonebook.notes.PhoneBook;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.MatchResult;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();
        MissedCallsBook missedCallsBook = new MissedCallsBook();

        //Создадим группы в телефонной книге
        phoneBook.initialPhoneBook();

        //Меню
        menu(scanner, phoneBook, missedCallsBook);
    }

    private static void menu(Scanner scanner, PhoneBook phoneBook, MissedCallsBook missedCallsBook) {
        while (true) {
            showMessage("\nВыберите действие: \n" +
                    "1. Заполнить книгу несколькими контактами\n" +
                    "2. Добавить один контакт в группу\n" +
                    "3. Вывести все контакты по группам\n" +
                    "4. Вывести контакты нужной группы\n" +
                    "5. Вывести все контакты по алфавиту\n" +
                    "6. Добавить пропущенный звонок\n" +
                    "7. Вывести пропущенные вызовы\n" +
                    "0. Выход");
            try {
                int menuPoint = 0;
                try {
                    menuPoint = Integer.parseInt(scanner.nextLine());
                    if (menuPoint == 0) {
                        break;
                    }
                }catch (NumberFormatException ex) {
                    System.err.println("Выберите пункт меню!");
                    continue;
                }

                switch (menuPoint) {
                    case 1:
                        //Заполним телефонную книгу контактами
                        fillPhoneBookByContacts(scanner, phoneBook);
                        break;
                    case 2:
                        //Добавить контакт в группу
                        addContactToGroup(scanner, phoneBook);
                        break;
                    case 3:
                        //Вывод информации из телефонной книги
                        printContactList(phoneBook);
                        break;
                    case 4:
                        //Вывести контакты конкретной группы
                        filterByGroup(scanner, phoneBook);
                        break;
                    case 5:
                        //Вывести контакты по алфавиту
                        sortedPhoneBookContacts(phoneBook);
                        break;
                    case 6:
                        //Вывести контакты по алфавиту
                        addMissedCall(scanner, missedCallsBook);
                        break;
                    case 7:
                        //Вывести контакты по алфавиту
                        printMissedCalls(missedCallsBook);
                        break;
                    default:
                        scanner.close();
                        System.exit(0);
                        break;
                }
            } catch (InputMismatchException exception) {
                showErrorMessage("Вы не выбрали номер группы, а ввели букву.");
                scanner.nextLine();
                continue;
            }
        }
    }

    private static void printMissedCalls(MissedCallsBook missedCallsBook) {
        System.out.println("Список пропущенных вызовов:");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm dd.MM.yyyy");

        for (Map.Entry<LocalDateTime, String> missedCall : missedCallsBook.getMissedCallsBook().entrySet()){
            System.out.println(missedCall.getKey().format(dateTimeFormatter) + " " + missedCall.getValue());
        }
    }

    private static void addMissedCall(Scanner scanner, MissedCallsBook missedCallsBook) {

        System.out.println("Введите дату звонка в формате ЧЧ:ММ ДД.ММ и номер телефона: ");
        scanner.findInLine("(\\d\\d):(\\d\\d) (\\d\\d)\\.(\\d\\d)");

        while (true) {
            try {
                //Получить дату и время звонка
                MatchResult mr = scanner.match();
                ArrayList<Integer> parsedDateTime = dateTimeParser(mr);
                DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm dd.MM.yyyy");
                LocalDateTime dt = LocalDateTime.of(Calendar.getInstance().get(Calendar.YEAR),
                        parsedDateTime.get(3), parsedDateTime.get(2), parsedDateTime.get(1), parsedDateTime.get(0));
                scanner.nextLine();

                //Получить телефон
                System.out.println("Введите номер телефона: ");
                String phoneNumber = scanner.nextLine();

                missedCallsBook.getMissedCallsBook().put(dt, phoneNumber);
                break;
            } catch (IllegalStateException | DateTimeException e) {
                System.err.println("Неверный формат даты. Дата должна быть в формате ЧЧ:ММ ДД.ММ");
                scanner.nextLine();
                break;
            }
        }
    }

    private static ArrayList<Integer> dateTimeParser(MatchResult mr){
        ArrayList<Integer> parsedDateTime = new ArrayList<>();
        int month = Integer.parseInt(mr.group(4));
        int day = Integer.parseInt(mr.group(3));
        int hour = Integer.parseInt(mr.group(1));
        int minute = Integer.parseInt(mr.group(2));

        parsedDateTime.add(minute);
        parsedDateTime.add(hour);
        parsedDateTime.add(day);
        parsedDateTime.add(month);

        return parsedDateTime;
    }

    private static void fillPhoneBookByContacts(Scanner scanner, PhoneBook phoneBook) {
        while (!addContactToGroup(scanner, phoneBook).equals("stop")) {
        }
    }

    private static String addContactToGroup(Scanner scanner, PhoneBook phoneBook) {
        showMessage("Введите имя контакта и телефон через двоеточие (для завершения введите 'стоп'): ");
        String input = scanner.nextLine();
        if (input.equals("стоп")) {
            return "stop";
        }
        String[] nameAndPhone = input.split(":");
        try {
            if (nameAndPhone.length < 2) {
                throw new IllegalArgumentException();
            }
            ArrayList<Integer> group = getContactGroup(scanner);
            phoneBook.addContactToGroup(buildContact(nameAndPhone), group);
        } catch (IllegalArgumentException illegalArgumentException) {
            showErrorMessage("Вы не ввели один из параметров.");
        } catch (PhoneValidator phoneValidator) {
            showErrorMessage(phoneValidator.getMessage());
        }
        return "continue";
    }

    private static Contact buildContact(String[] nameAndPhone) throws PhoneValidator {
        Contact contact = new Contact(
                nameAndPhone[0].trim().split(" ")[0],
                nameAndPhone[0].trim().split(" ")[1],
                nameAndPhone[1].trim());
        return contact;
    }

    private static ArrayList<Integer> getContactGroup(Scanner scanner) {
        while (true) {
            showMessage("Выберите группу из списка. Допускается выбрать несколько групп (через пробел): ");
            Group.showContactGroups();
            ArrayList<String> groupsArr = new ArrayList<>();
            try {
                String input = scanner.nextLine();
                groupsArr.addAll(Arrays.asList(input.split(" ")));
                validateSelectedGroups(groupsArr);
            } catch (IndexOutOfBoundsException exception) {
                showErrorMessage("Такой группы контактов нет в списке.");
                continue;
            } catch (InputMismatchException exception) {
                showErrorMessage("Вы не выбрали номер группы, а ввели букву.");
                scanner.nextLine();
                continue;
            }
            return convertToInteger(groupsArr);
        }
    }

    private static ArrayList<Integer> convertToInteger(ArrayList<String> groupsArr) {
        ArrayList<Integer> groupsArrInt = new ArrayList<>();
        for (String groupId : groupsArr) {
            groupsArrInt.add(Integer.parseInt(groupId));
        }
        return groupsArrInt;
    }

    private static void validateSelectedGroups(ArrayList<String> groupsArr) {
        for (String groupId : groupsArr) {
            if (Integer.parseInt(groupId) < 1 || Integer.parseInt(groupId) > Group.values().length) {
                throw new IndexOutOfBoundsException();
            }
        }
    }

    private static void filterByGroup(Scanner scanner, PhoneBook phoneBook) {
        ArrayList<Integer> groups = getContactGroup(scanner);
        for (int i = 0; i < groups.size(); i++) {
            showMessage("Контакты группы " + Group.values()[groups.get(i) - 1] + ":");
            printContactListByGroup(phoneBook.getGroupContacts(groups.get(i)));
        }
    }

    private static void printContactListByGroup(HashSet<Contact> contacts) {
        for (Contact contact : contacts) {
            showMessage("  - Контакт: " + contact.getName() + " " + contact.getLastName() +
                    " Телефон: " + contact.getPhoneNumber());
        }
    }

    private static void printContactList(PhoneBook phoneBook) {
        for (Map.Entry<Group, HashSet<Contact>> entry : phoneBook.getPhoneBook().entrySet()) {
            showMessage("Группа контактов " + entry.getKey() + ":");
            for (Contact contact : entry.getValue()) {
                showMessage("  - Контакт: " + contact.getName() + " " + contact.getLastName() +
                        " Телефон: " + contact.getPhoneNumber());
            }
        }
    }

    private static void sortedPhoneBookContacts(PhoneBook phoneBook) {
        ArrayList<Contact> contacts = new ArrayList<>();
        for (Map.Entry<Group, HashSet<Contact>> entry : phoneBook.getPhoneBook().entrySet()) {
            for (Contact contact : entry.getValue()) {
                contacts.add(contact);
            }
        }
        for (Contact contact : contacts) {
            showMessage(contact.getLastName());
        }
        makeContactsSorted(contacts);
        for (Contact contact : contacts) {
            showMessage(contact.getName() + " " + contact.getLastName() + " " + contact.getPhoneNumber());
        }
    }

    private static void makeContactsSorted(ArrayList<Contact> contacts) {
        for (int i = contacts.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (contacts.get(j).compareTo(contacts.get(j + 1)) == 1) {
                    Contact tmp = contacts.get(j);
                    contacts.set(j, contacts.get(j + 1));
                    contacts.set(j + 1, tmp);
                }
            }
        }
    }
    private static void showMessage(String message) {
        System.out.println(message);
    }
    private static void showErrorMessage(String errorMessage) {
        System.err.println(errorMessage);
    }
}
