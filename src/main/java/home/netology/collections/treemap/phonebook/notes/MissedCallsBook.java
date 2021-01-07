package main.java.home.netology.collections.treemap.phonebook.notes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
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
