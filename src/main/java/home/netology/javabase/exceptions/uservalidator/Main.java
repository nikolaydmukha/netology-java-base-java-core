package home.netology.javabase.exceptions.uservalidator;

import home.netology.javabase.exceptions.uservalidator.ex.AccessDeniedException;
import home.netology.javabase.exceptions.uservalidator.ex.UserNotFoundException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите логин");
        String login = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();

        //Проверить логин и пароль
        User user = getUserByLoginAndPassword(login, password);
        //Вызвать методы валидации пользователя
        validateUser(user);

        System.out.println("Доступ представлен");
    }

    public static User[] getUsers() {
        User user1 = new User("jhon1", "pass", "jhon1@gmail.com", (byte) 24);
        User user2 = new User("jhon2", "pass", "jhon2@gmail.com", (byte) 42);
        User user3 = new User("jhon3", "pass", "jhon3@gmail.com", (byte) 18);
        User user4 = new User("jhon4", "pass", "jhon4@gmail.com", (byte) 15);

        return new User[]{user1, user2, user3, user4};
    }

    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = getUsers();
        for (User user : users) {
            if (login.equals(user.getLogin()) && password.equals(user.getPassword())) {
                return user;
            }
        }
        throw new UserNotFoundException("User not found");
    }
    public static void validateUser(User user) throws AccessDeniedException {
        if (user.getAge() < 18){
            throw new AccessDeniedException("You need to be older than 18");
        }
    }
}
