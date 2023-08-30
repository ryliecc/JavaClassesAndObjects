import java.util.Arrays;

public class Library {
    Book[] books = new Book[3];

    public Library() {
        books[0] = new Book();
        books[1] = new Book();
        books[2] = new Book();
    }

    public void setBook(int index, String author, String title, String isbn) {
        books[index].setAuthor(author);
        books[index].setTitle(title);
        books[index].setIsbn(isbn);
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(books) +
                '}';
    }
}
