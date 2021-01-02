package main.java.home.netology.abstract_interface.library;

import main.java.home.netology.abstract_interface.library.interfaces.IDistributor;
import main.java.home.netology.abstract_interface.library.interfaces.IReader;

public class Distributor extends LibraryReader implements IReader, IDistributor {

    private String company;

    public Distributor(String userName, String id, String company) {
        this.userName = userName;
        this.id = id;
        this.company = company;
    }

    @Override
    public void shippingBooks() {
        System.out.printf("Дистрибьютор %s(%s) сейчас поставляет партию книг\n", userName, company);
    }

    @Override
    public void getDiscount() {
    }
}
