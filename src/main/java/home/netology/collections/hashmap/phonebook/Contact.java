package main.java.home.netology.collections.hashmap.phonebook;

public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) throws PhoneValidator {
        this.name = name;
        this.phoneNumber = phoneValidator(phoneNumber);
    }

    private String phoneValidator(String phoneNumber) throws PhoneValidator {

        if (phoneNumber.matches("\\d{11}")) {                                       //89262223344
            return phoneNumber;
        } else if (phoneNumber.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}")) {   //926-222-3344, 926.222.3344, 926 222 3344
            return phoneNumber;
        } else if (phoneNumber.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}")) {             //(926)-111-2233
            return phoneNumber;
        } else {
            throw new PhoneValidator("Неверно введён номер телефона.");
        }
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
