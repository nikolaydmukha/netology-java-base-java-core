package home.netology.javabase.collections.hashmap.warehouse;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Storage> storages = initStorages();

        while (true) {

            menu();
            String point = scanner.nextLine();
            if (point.isEmpty()) {
                break;
            }
            try {
                selectAction(Integer.parseInt(point), scanner, storages);
            } catch (NumberFormatException ex) {
                System.err.println("Выберите пункт меню.");
                continue;
            }

        }
    }

    private static ArrayList<Storage> initStorages() {
        Storage storage1 = new Storage("Склад 1", "Москва, Профсоюзная 97");
        Storage storage2 = new Storage("Склад 2", "Одинцово, Союзная 11");
        ArrayList<Storage> storages = new ArrayList();

        storages.add(storage1);
        storages.add(storage2);
        return storages;
    }

    private static void menu() {
        System.out.println("1. Добавить товар на склад;\n" +
                "2. Поиск товара;\n" +
                "3. Вывод товаров со всех складов;\n" +
                "Enter для завершения.\n");
    }

    private static void selectAction(int point, Scanner scanner, ArrayList<Storage> storages) {
        switch (point) {
            case 1:
                addProduct(scanner, storages);
                break;
            case 2:
                searchProduct(scanner, storages);
                break;
            case 3:
                printStorageProducts(storages);
            default:
                break;
        }
    }

    private static void addProduct(Scanner scanner, ArrayList<Storage> storages) {
        int number = 0;
        String name = null;
        double price = 0.0;
        double quantity = 0.0;

        while (true) {
            try {
                if (number == 0) {
                    System.out.println("Введите идентификационный номер и нажмите <enter>");
                    number = scanner.nextInt();
                    scanner.nextLine();
                }
                if (name == null) {
                    System.out.println("Введите название и нажмите <enter>");
                    name = scanner.nextLine();
                }
                if (price == 0.0) {
                    System.out.println("Введите цену (00.00) товара (за кг, литр) и нажмите <enter>");
                    price = scanner.nextDouble();
                    scanner.nextLine();
                }
                if (quantity == 0.0) {
                    System.out.println("Введите количество (00.00) товара (шт, литры, кг) и нажмите <enter>");
                    quantity = scanner.nextDouble();
                    scanner.nextLine();
                }
                makeProduct(number, name, price, quantity);
                int storageId = selectStorage(storages, scanner);
                //Добавить продукт на склад
                storages.get(storageId - 1).getStorage().add(makeProduct(number, name, price, quantity));
                break;
            } catch (NumberFormatException | InputMismatchException ex) {
                System.err.println("Введите число");
                scanner.nextLine();
                continue;
            }
        }
    }

    private static void searchProduct(Scanner scanner, ArrayList<Storage> storages) {
        System.out.println("Введите идентификационный номер товара");
        while (true) {
            try {
                int identNumber = scanner.nextInt();
                scanner.nextLine();
                for (Storage storage : storages) {
                    boolean isExist = false;
                    System.out.println("Склад " + storage.getName() + ", адрес:" + storage.getAddress());
                    for (Product product : storage.getStorage()) {
                        if (product.getNumber() == identNumber) {
                            System.out.printf("Товар номер: %s название: %s цена: %s количество: %s\n",
                                    product.getNumber(), product.getName(), product.getPrice(), product.getWeight());
                            isExist = true;
                        }
                        if (!isExist) {
                            System.out.println("На складе не найдено искомого товара.");
                        }
                    }
                }
                break;
            } catch (NumberFormatException | InputMismatchException ex) {
                System.err.println("Введите число");
                scanner.nextLine();
                continue;
            }
        }
    }

    private static Product makeProduct(int number, String name, double price, double quantity) {
        return new Product(number, name, price, quantity);
    }

    private static int selectStorage(ArrayList<Storage> storages, Scanner scanner) {
        System.out.println("Выберите склад:\n");
        printFroSelectStorage(storages);
        int storageNumber;
        while (true) {
            try {
                storageNumber = scanner.nextInt();
                scanner.nextLine();
                return storageNumber;
            } catch (NumberFormatException | InputMismatchException ex) {
                System.err.println("Введите число");
                scanner.nextLine();
                continue;
            }
        }
    }

    private static void printFroSelectStorage(ArrayList<Storage> storages) {
        int i = 1;
        for (Storage storage : storages) {
            System.out.println(i + ". " + storage.getAddress());
            i++;
        }
    }

    private static void printStorageProducts(ArrayList<Storage> storages) {
        System.out.println("Список всех товаров всех складов:");
        for (Storage storage : storages) {
            System.out.println("Склад " + storage.getName() + ", адрес:" + storage.getAddress());
            for (Product product : storage.getStorage()) {
                System.out.printf("Товар номер: %s название: %s цена: %s количество: %s\n",
                        product.getNumber(), product.getName(), product.getPrice(), product.getWeight());

            }
        }
    }
}
