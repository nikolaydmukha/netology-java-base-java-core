package main.java.home.netology.collections.hashmap.phonebook;

public enum Group {
    FRIEND,
    WORK,
    FAMILY,
    SPORT,
    HOBBY;

    public static void showContactGroups() {
        int i = 1;
        for (Group group : Group.values()){
            System.out.println(i + ". " + group);
            i++;
        }
    }
}
