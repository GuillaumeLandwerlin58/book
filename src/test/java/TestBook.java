import Book.Book;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBook {
    @DisplayName("Book")
    @ParameterizedTest(name = "converting {0} should return {1}")
    @CsvSource({
            "The Hobbit, J.R.R. Tolkien, 1937",
            "The Lord of the Rings, J.R.R. Tolkien, 1954",
            "The Silmarillion, J.R.R. Tolkien, 1977"
    })
    public void testBook(String title, String author, String date) {
        Book book = new Book(title, author, date);
        assertEquals(title, book.getTitle());
    }
}
