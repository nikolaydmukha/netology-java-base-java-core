package main.java.home.netology.javabase.OOP.inheritance.booksgenre;

public class BookService {
    //bookList - список книг, genre - жанр для фильтрации (поиска соответствия)
    public void filterBookByGenre(Book[] bookList, Genre genre) {
        for (Book book : bookList) {
            //перебираем все книги по очереди
            for (Genre genreFromBook : book.getGenres()) {
                //у каждой книги перебираем всю коллекцию жанров, которыми она обладает
                if (genreFromBook.getAttributeOfGenre().equals(genre.getAttributeOfGenre())) {
                    //если базовый тип соотвествует базовому типу жанра, который мы передали в качестве аргумента
                    // методу, то переходим к следующей проверке
                    if (genreFromBook.equals(genre)) {
                        //если жанр соответствует искомому, значит книга подходит по жанру
                        System.out.println("Книга - " + book.getTitle() + " подходит под данный фильтр: жанр - " + genre.getGenreName());
                        break;
                    } else { //книга не прошла фильтр
                        System.out.println("Книга - " + book.getTitle() + " не прошла фильтр: жанр - " + genre.getGenreName() + ", критерий - " +
                                genre.getAttributeOfGenre() + ", так как имеет жанр " +
                                genreFromBook.getGenreName());
                    }
                }
            }
        }
    }
}
