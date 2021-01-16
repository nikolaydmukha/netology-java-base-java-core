package home.netology.javabase.OOP.inheritance.booksstatus;

public class Main {
    public static void main(String[] args) {
        //Create some books
        Book book1 = new Book("Война и Мир", "Л. Н. Толстой");
        Book book2 = new Book("Отцы и дети", "И. С. Тургенев");

        //Create bookmover objects
        BookMover fromAvailableStatusMover = new FromAvailableStatusMover();
        fromAvailableStatusMover.moveToStatus(book1, Status.BORROWED);
        System.out.println(book1.getStatus());

        FromBorrowedStatusMover fromBorrowedStatus = new FromBorrowedStatusMover();
        fromBorrowedStatus.moveToStatus(book1, Status.OVERDUED);
        System.out.println(book1.getStatus());

        fromBorrowedStatus.moveToStatus(book2, Status.OVERDUED);
    }
}
