package main.java.home.netology.collections.listcollection.email;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<UserProfile> userProfiles = new ArrayList<>();
        String textTemplate = "Здравствуйте, %s, у нас для вас специальное предложение!";
        List<Mail> emailList = new ArrayList<>();

        UserProfile userProfile1 = new UserProfile("Иван", "Иванов", "ivan777@yandex.ru");
        UserProfile userProfile2 = new UserProfile("Татьяна","Татьянова","tatiana1@yandex.ru");
        UserProfile userProfile3 = new UserProfile("Ольга", "Ольгова", "olga123@yandex.ru");


        userProfiles.add(userProfile1);
        userProfiles.add(userProfile2);
        userProfiles.add(userProfile3);

        for (UserProfile userProfile: userProfiles) {
            Mail email = new Mail(userProfile.getEmail(), String.format(textTemplate, userProfile.getName()));
            emailList.add(email);
        }

        Iterator<Mail> emailListIterator = emailList.iterator();
        while (emailListIterator.hasNext()) {
            Mail email = emailListIterator.next();
            System.out.printf("%s\n\n", email);
        }
    }
}
