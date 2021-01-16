package home.netology.javabase.abstract_interface.library.interfaces;

public interface IDistributor extends IReader {
    void shippingBooks();
    default void callToLibrary() {
        System.out.println("Позвонить в библиотеку для уточнения необходимости поставки.");
    }
}
