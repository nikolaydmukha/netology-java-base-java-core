package main.java.home.netology.collections.treeset.wishlist.wishcomparator;

import main.java.home.netology.collections.treeset.wishlist.Wish;

import java.util.Comparator;

public class WishComparatorByPrice implements Comparator<Wish> {
    private SortType directionSort;

    public WishComparatorByPrice(SortType directionSort) {
        this.directionSort = directionSort;
    }

    public SortType getDirectionSort() {
        return directionSort;
    }

    @Override
    public int compare(Wish wish1, Wish wish2) {
        if (this.directionSort.equals(SortType.ASCBYPRICE)) {
            return Double.valueOf(wish1.getPrice()).compareTo(Double.valueOf(wish2.getPrice()));
        } else {
            if (wish1.getPrice() > wish2.getPrice()) {
                return -1;
            } else if (wish1.getPrice() < wish2.getPrice()) {
                return 1;
            }
            return 0;
        }
    }

    @Override
    public String toString() {
        if (this.directionSort.equals(SortType.ASCBYPRICE)) {
            return "Сортировка по возрастанию цены:";
        }
        return "Сортировка по убыванию цены:";
    }

}