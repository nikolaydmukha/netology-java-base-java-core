package main.java.home.netology.collections.treeset.wishlist.wishcomparator;

import main.java.home.netology.collections.treeset.wishlist.Wish;

import java.util.Comparator;

public class WishComparatorByName implements Comparator<Wish> {
    private SortType sortType;

    public WishComparatorByName(SortType sortType) {
        this.sortType = sortType;
    }

    public SortType getSortType() {
        return sortType;
    }

    @Override
    public int compare(Wish wish1, Wish wish2) {
        return wish1.getName().toLowerCase().compareTo(wish2.getName().toLowerCase());
    }

    @Override
    public String toString() {
        return "Стандартная сортировка по названию (алфавитный порядок)";
    }
}
