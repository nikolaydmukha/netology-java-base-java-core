package home.netology.javabase.OOP.inheritance.booksstatus;

public class FromBorrowedStatusMover extends BookMover {

    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        switch (requestedStatus) {
            case ARCHIVED:
            case AVAILABLE:
            case OVERDUED:
                book.setStatus(requestedStatus);
                System.out.println("Successfully moved book from  " + Status.BORROWED + " status to " + requestedStatus + " status");
                break;
            case BORROWED:
                book.setStatus(requestedStatus);
                System.out.println("The book is already in " + Status.BORROWED + " status");
                break;
            default:
                System.out.println("It is impossible to move status book from " + book.getStatus() + " status to "+ requestedStatus + " status");
                break;
        }
    }
}
