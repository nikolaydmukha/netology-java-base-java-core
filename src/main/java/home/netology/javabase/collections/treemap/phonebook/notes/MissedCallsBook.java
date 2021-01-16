package home.netology.javabase.collections.treemap.phonebook.notes;

import java.time.LocalDateTime;
import java.util.TreeMap;

public class MissedCallsBook {
    private TreeMap<LocalDateTime, String> missedCallsBook;

    public MissedCallsBook() {
        missedCallsBook = new TreeMap<>();
    }

    public TreeMap<LocalDateTime, String> getMissedCallsBook() {
        return missedCallsBook;
    }

}
