package home.netology.javabase.collections.treeset.library;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        if (book1.getTitle().hashCode() > book2.getTitle().hashCode()){
            return 1;
        }else if (book1.getTitle().hashCode() < book2.getTitle().hashCode()) {
            return -1;
        } else {
            return 0;
        }
    }
}
