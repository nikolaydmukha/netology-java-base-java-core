package main.java.home.netology.javabase.collections.hashmap.phonebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class PhoneBook {

    HashMap<Group, HashSet<Contact>> phoneBook = new HashMap<>();

    public void initialPhoneBook() {
        for (Group group : Group.values()) {
            addGroupToPhoneBook(group);
        }
    }

    public HashMap<Group, HashSet<Contact>> getPhoneBook() {
        return phoneBook;
    }

    public void addContactToGroup(Contact contact, ArrayList<Integer> groups) {
        for(int i = 0; i < groups.size(); i++) {
            getGroupContacts(groups.get(i)).add(contact);
        }
    }

    public void addGroupToPhoneBook(Group group) {
        phoneBook.put(group, new HashSet<>());
    }

    public HashSet<Contact> getGroupContacts(int group){

        return phoneBook.get(Group.values()[group - 1]);
    }

}

