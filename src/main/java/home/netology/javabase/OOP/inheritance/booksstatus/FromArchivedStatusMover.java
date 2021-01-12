package main.java.home.netology.javabase.OOP.inheritance.booksstatus;

public class FromArchivedStatusMover extends BookMover {

    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        switch (requestedStatus) {
            case AVAILABLE:
                book.setStatus(requestedStatus);
                System.out.println("Successfully moved book from  " + Status.AVAILABLE + " status to " + requestedStatus + " status");
                break;
            case ARCHIVED:
                book.setStatus(requestedStatus);
                System.out.println("The book is already in " + Status.ARCHIVED + " status");
                break;
            default:
                System.out.println("It is impossible to move status book from " + book.getStatus() + " status to "+ requestedStatus + " status");
                break;
        }
    }
}
