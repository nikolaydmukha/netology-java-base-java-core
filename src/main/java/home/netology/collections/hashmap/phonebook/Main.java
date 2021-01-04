package main.java.home.netology.collections.hashmap.phonebook;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();

        //Создадим группы в телефонной книге
        phoneBook.initialPhoneBook();
        //Меню
        menu(scanner, phoneBook);
    }

    private static void menu(Scanner scanner, PhoneBook phoneBook) {
        while (true) {
            showMessage("Выберите действие: \n" +
                    "1. Заполнить книгу несколькими контактами;\n" +
                    "2. Добавить один контакт в группу;\n" +
                    "3. Вывести все контакты по группам;\n" +
                    "4. Вывести контакты нужной группы;\n" +
                    "5. Вывести все контакты по алфавиту;");
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
                        //Вывести контакты конкретной группы
                        filterByGroup(scanner, phoneBook);
                        break;
                    case 5:
                        //Вывести контакты по алфавиту
                        sortedPhoneBookContacts(phoneBook);
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


