package carpkg;

public class Book {

    String title;
    String author;

    public Book(String title, String author)
    {
        this.title = title;
        this.author = author;
    }

    public void displayBook()
    {
        System.out.println(title);
        System.out.println(author);
    }

    public static void main(String[] args) {

        Book b1 = new Book("Fantasy", "Candy");
        b1.displayBook();

    }
}