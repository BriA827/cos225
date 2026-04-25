public class Booktester{

    public Booktester(){
        Book book1 = new Book("The Heart of the Betrayed", "Crime");
        Book book2 = new Book("One of a Kind", "Science Fiction");
        
        System.out.println(book1.toString());
        System.out.println(book2.toString());

        Book[] books = new Book[2];
        books[0] = book1;
        books[1] = book2;

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].toString());
        }
    }
}