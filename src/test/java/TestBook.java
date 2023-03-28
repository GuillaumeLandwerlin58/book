import org.testng.annotations.Test;
import org.junit.jupiter.params.provider.CsvSource;

public class TestBook {
    @CsvSource({
            "The Hobbit, J.R.R. Tolkien, 1937",
            "The Lord of the Rings, J.R.R. Tolkien, 1954",
            "The Silmarillion, J.R.R. Tolkien, 1977"
    })
    public void testBook(String title, String author, String date) {
        Book book = new Book(title, author, date);
        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getDate());
    }
}
