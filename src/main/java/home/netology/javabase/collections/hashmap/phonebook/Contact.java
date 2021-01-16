package home.netology.javabase.collections.hashmap.phonebook;

public class Contact implements Comparable {
    private String name;
    private String lastName;
    private String phoneNumber;

    public Contact(String name, String lastName, String phoneNumber) throws PhoneValidator {
        this.name = name;
        this.lastName = lastName;
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

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public int compareTo(Object that) {
        if (that == this) {
            return 1;
        }
        if (that == null) {
            return -1;
        }
        if (that instanceof Contact) {
            if (this.getLastName().charAt(0) > ((Contact) that).getLastName().charAt(0)) {
                return 1;
            } else if (this.getLastName().charAt(0) == ((Contact) that).getLastName().charAt(0)) {
                return 0;
            }
        }
        return 0;
    }
}
