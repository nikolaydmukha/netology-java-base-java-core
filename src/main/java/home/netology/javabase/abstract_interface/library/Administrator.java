package home.netology.javabase.abstract_interface.library;

import home.netology.javabase.abstract_interface.library.interfaces.IAdministrator;

public class Administrator implements IAdministrator {
    @Override
    public void orderBooks() {
        System.out.println("Сделать заказ на поставку книг.");
    }

    @Override
    public void paySalary() {
        System.out.println("Выдать зарплату сотрудникам библиотеки.");
    }

}
