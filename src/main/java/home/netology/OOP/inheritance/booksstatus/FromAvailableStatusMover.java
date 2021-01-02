package main.java.home.netology.OOP.inheritance.booksstatus;

public class FromAvailableStatusMover extends BookMover {

    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        switch (requestedStatus) {
            case BORROWED:
                book.setStatus(requestedStatus);
                System.out.println("Successfully moved book from  " + Status.AVAILABLE + " status to " + requestedStatus + " status");
                break;
            case ARCHIVED:
                System.out.println("Successfully moved book from  " + Status.AVAILABLE + " status to " + requestedStatus + " status");
                break;
            case AVAILABLE:
                System.out.println("The book is already in " + Status.AVAILABLE + " status");
                break;
            default:
                System.out.println("It is impossible to move status book from " + book.getStatus() + " status to "+ requestedStatus + " status");
                break;
        }
    }
}
