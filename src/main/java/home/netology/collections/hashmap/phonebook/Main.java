package main.java.home.netology.collections.hashmap.phonebook;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();

        //Создадим группы в телефонной книге
        phoneBook.initialPhoneBook();

        menu(scanner, phoneBook);
    }

    private static void menu(Scanner scanner, PhoneBook phoneBook) {
        while (true) {
            System.out.println("Выберите действие: \n" +
                    "1. Заполнить книгу контактами;\n" +
                    "2. Добавить контакт в группу;\n" +
                    "3. Вывести все контакты;\n" +
                    "4. Вывести контакты нужной группы;");
            try {
                int menuPoint = scanner.nextInt();
                scanner.nextLine();
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
                        //Вывести контакты группы
                        filterByGroup(scanner, phoneBook);
                        break;
                    default:
                        System.exit(0);
                        break;
                }
            } catch (InputMismatchException exception) {
                System.err.println("Вы не выбрали номер группы, а ввели букву.");
                scanner.nextLine();
                continue;
            }
        }
    }

    private static void printContactList(PhoneBook phoneBook) {
        for (Map.Entry<Group, HashSet<Contact>> entry : phoneBook.getPhoneBook().entrySet()) {
            System.out.println("Группа контактов " + entry.getKey() + ":");
            for (Contact contact : entry.getValue()) {
                System.out.println("  - Фамилия: " + contact.getName() + " Телефон: " + contact.getPhoneNumber());
            }
        }
    }

    private static void fillPhoneBookByContacts(Scanner scanner, PhoneBook phoneBook) {
        while (!addContactToGroup(scanner, phoneBook).equals("stop")) {
        }
    }

    private static int getContactGroup(Scanner scanner) {
        while (true) {
            System.out.println("Выберите группу из списка: ");
            Group.showContactGroups();
            int group;
            try {
                group = scanner.nextInt();
                scanner.nextLine();
                if (group < 1 || group > Group.values().length) {
                    throw new IndexOutOfBoundsException();
                }
            } catch (IndexOutOfBoundsException exception) {
                System.err.println("Такой группы контактов нет в списке.");
                continue;
            } catch (InputMismatchException exception) {
                System.err.println("Вы не выбрали номер группы, а ввели букву.");
                scanner.nextLine();
                continue;
            }
            return group;
        }
    }

    private static String addContactToGroup(Scanner scanner, PhoneBook phoneBook) {
        System.out.println("Введите имя контакта и телефон (для завершения введите 'стоп'): ");
        String input = scanner.nextLine();
        if (input.equals("стоп")) {
            return "stop";
        }
        String[] nameAndPhone = input.split(" ");
        try {
            if (nameAndPhone.length < 2) {
                throw new IllegalArgumentException();
            }
            Contact contact = new Contact(nameAndPhone[0], nameAndPhone[1]);
            int group = getContactGroup(scanner);
            phoneBook.addContactToGroup(contact, group);
        } catch (IllegalArgumentException illegalArgumentException) {
            System.err.println("Вы не ввели один из параметров.");
        } catch (PhoneValidator phoneValidator) {
            System.err.println(phoneValidator.getMessage());
        }
        return "continue";
    }

    private static void  filterByGroup(Scanner scanner, PhoneBook phoneBook){
        int group = getContactGroup(scanner);
        System.out.println("Контакты группы " + Group.values()[group - 1] + ":");
        printContactListByGroup(phoneBook.getGroupContacts(group));
    }

    private static void printContactListByGroup(HashSet<Contact> contacts) {
            for (Contact contact : contacts) {
                System.out.println("  - Фамилия: " + contact.getName() + " Телефон: " + contact.getPhoneNumber());
            }
    }
}


