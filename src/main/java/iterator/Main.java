package iterator;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        List<Book> bookList = Arrays.asList(
                new Book("Around the World in 80 Days"),
                new Book("Bible"),
                new Book("Cinderella"),
                new Book("Daddy-Long-Legs")
        );
        bookList.forEach(bookShelf::appendBook);

        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }

    }
}
