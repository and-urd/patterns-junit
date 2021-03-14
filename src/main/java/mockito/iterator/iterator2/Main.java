package mockito.iterator.iterator2;


import mockito.iterator.iterator1.Book;

import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {



    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());

        Book book1 = new Book("5656435", "Hawkins", 2021 );
        Book book2 = new Book("124234fdfg", "Tolle", 1997 );
        Book book3 = new Book("42536357657", "David", 1500 );

        BookShop books = new BookShop();
        books.addBook(book1);
        books.addBook(book2);
        books.addBook(book3);


        Iterator<Book> iterador = books.iterator();
        while (iterador.hasNext()){
            Book book = iterador.next();
            logger.log(Level.INFO, book.toString());
        }
        logger.log(Level.INFO,"============");

        for (Book book: books) {
            logger.log(Level.INFO, book.toString());
        }
    }
}
