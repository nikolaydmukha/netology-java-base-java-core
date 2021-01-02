package main.java.home.netology.OOP.inheritance.booksstatus;

public class FromOverduedStatusMover extends BookMover {

    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        switch (requestedStatus) {
            case ARCHIVED:
            case AVAILABLE:
                book.setStatus(requestedStatus);
                System.out.println("Successfully moved book from  " + Status.OVERDUED + " status to " + requestedStatus + " status");
                break;
            case OVERDUED:
                book.setStatus(requestedStatus);
                System.out.println("The book is already in " + Status.OVERDUED + " status");
                break;
            default:
                System.out.println("It is impossible to move status book from " + book.getStatus() + " status to "+ requestedStatus + " status");
                break;
        }
    }
}
