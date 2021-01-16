package home.netology.javabase.collections.treeset.wishlist;

import home.netology.javabase.collections.treeset.wishlist.wishcomparator.SortType;
import home.netology.javabase.collections.treeset.wishlist.wishcomparator.WishComparatorByName;
import home.netology.javabase.collections.treeset.wishlist.wishcomparator.WishComparatorByPrice;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            ArrayList<TreeSet<Wish>> sets = initTreeSets();

            addWish(scanner, sets);
            printedSortedWishes(sets);
            break;
        }
    }

    private static void addWish(Scanner scanner, ArrayList<TreeSet<Wish>> sets) {
        String name = "", description = "", url = "";
        double price = 0;
        int priority = 0;

        while (true) {
            try {
                name = name.isEmpty() ? getWishName(scanner) : name;
                if (name.isEmpty()) {
                    break;
                }
                description = description.isEmpty() ? getWishDescription(scanner) : description;
                price = price == 0 ? getWishPrice(scanner) : price;
                url = url.isEmpty() ? getWishURL(scanner) : url;
                priority = priority == 0 ? getWishPriority(scanner) : priority;

                addWishToTreeSet(makeWish(name, description, price, url, priority), sets);
                name = "";
                description = "";
                url = "";
                price = 0;
                priority = 0;

            } catch (InputMismatchException ex) {
                System.err.println("На данном шаге нельзя вводить буквы");
                scanner.nextLine();
                continue;
            }
        }
    }

    private static void addWishToTreeSet(Wish wish, ArrayList<TreeSet<Wish>> sets) {
        for(TreeSet<Wish> treeSet : sets){
            treeSet.add(wish);
        }
    }

    private static Wish makeWish(String name, String description, double price, String url, int priority) {
        WishBuilder wishBuilder = new WishBuilder();
        return wishBuilder.withName(name)
                .withDescription(description)
                .withPrice(price)
                .withURL(url)
                .withPriority(priority)
                .build();
    }

    private static int getWishPriority(Scanner scanner) {
        System.out.println("Введите приоритет (от 0 до 5) хотелки:");
        int priority = scanner.nextInt();
        scanner.nextLine();
        return priority;
    }

    private static String getWishURL(Scanner scanner) {
        System.out.println("Введите ссылку, где можно купить хотелку:");
        return scanner.nextLine();
    }

    private static double getWishPrice(Scanner scanner) {
        System.out.println("Введите цену хотелки:");
        double price = scanner.nextDouble();
        scanner.nextLine();
        return price;
    }

    private static String getWishName(Scanner scanner) {
        System.out.println("Введите имя хотелки:");
        return scanner.nextLine();
    }

    private static String getWishDescription(Scanner scanner) {
        System.out.println("Введите описание хотелки:");
        return scanner.nextLine();
    }

    private static ArrayList<TreeSet<Wish>> initTreeSets() {
        ArrayList<TreeSet<Wish>> sets = new ArrayList<>();
        sets.add(new TreeSet<>(new WishComparatorByName(SortType.BYNAME)));
        sets.add(new TreeSet<>(new WishComparatorByPrice(SortType.ASCBYPRICE)));
        sets.add(new TreeSet<>(new WishComparatorByPrice(SortType.DESCBYPRICE)));
        System.out.println(sets.size());
        return sets;
    }

    private static void printedSortedWishes(ArrayList<TreeSet<Wish>> sets) {
        System.out.println("Отсортированный список.");
        for (TreeSet<Wish> treeSet : sets){
            System.out.println(treeSet.comparator().toString());
            for(Wish wish : treeSet){
                System.out.printf("- Название: %s Описание: %s Цена: %.2f Где купить: %s Приоритет: %d\n",
                        wish.getName(), wish.getDescription(), wish.getPrice(), wish.getUrl(), wish.getPriority());

            }
        }
    }
}
