package mockito.iterator.iterator1;

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

        CustomIterator iterador = books.iterator();
        while (iterador.hasNext()){
            Book book = (Book) iterador.next();
            logger.log(Level.INFO,"book: {}",book.toString());
        }




    }
}
