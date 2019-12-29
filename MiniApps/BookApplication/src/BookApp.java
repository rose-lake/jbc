import java.util.*;

public class BookApp {
    public static void main(String[] args){

        ArrayList<Book> bookList = new ArrayList<Book>();

        Book book1 = new Book();
        book1.setTitle("Born A Crime");
        book1.setAuthor("Trevor Noah");
        book1.setDescription("Trevor Noah's autobiography.");
        book1.setPrice(8.99);
        book1.setInStock(true);
        book1.setQuantityInStock(9);
        bookList.add(book1);
        Book book2 = new Book("Diary of a Wimpy Kid: Wrecking Ball", "Jeff Kinney",
                "An unexpected inheritance gives Greg Heffley’s family a chance to make big changes to their house",
                9.54, 8);
        Book book3 = new Book("The Giver of Stars: A Novel", "Jojo Moyes",
                "Set in Depression-era America, a breathtaking story of five extraordinary women and their remarkable journey.",
                21.49, 5);
        Book book4 = new Book("Where the Crawdads Sing", "Delia Owens",
                "At once an exquisite ode to the natural world, a heartbreaking coming-of-age story, and a surprising tale of possible murder.",
                15.39, 3);
        Book book5 = new Book("The Body Keeps the Score: Brain, Mind, and Body in the Healing of Trauma", "Bessel van der Kolk, M.D.",
                "Exposes the tremendous power of our relationships both to hurt and to heal—and offers new hope for reclaiming lives.",
                10.88, 1);
        Collections.addAll(bookList, book2, book3, book4, book5);

        System.out.println("**************************************");
        System.out.println("Assignment 1:\n");
        book1.getDisplayText();
        System.out.println("\n");

        System.out.println("**************************************");
        System.out.println("Assignment 2: Simple, for ONE book\n");
        requestBook(book1, 8);
        requestBook(book1, 10);
        Book outOfStockBook = new Book("This is a title", "This is an Author", "This book is about something", 1.99, 0);
        requestBook(outOfStockBook, 1);
        Book anotherOutOfStockBook = new Book("This is ANOTHER title", "This is ANOTHER Author", "This book is about SOMETHING", 2.99, -2);
        requestBook(anotherOutOfStockBook, 1);

        System.out.println("**************************************");
        System.out.println("Assignment 2: More Complicated, for a HashMap of books and their requested quantities\n");
        HashMap<Book, Integer> bookRequestMap= new HashMap<Book, Integer>();
        Random randomGenerator = new Random();
        for(Book book : bookList) {
            int rand = randomGenerator.nextInt(15) + 1;     // random request value from 1 to 15
            bookRequestMap.put(book, rand);
        }
        // from:  https://www.geeksforgeeks.org/iterate-map-java/   option 4: using forEach(action) and a lambda
        bookRequestMap.forEach((book, request) -> requestBook(book, request));

        // interpreting IntelliJ's hint on above statement...
        System.out.println("**************************************");
        System.out.println("Trying Assignment 2 again with sepcial 'method reference' syntax: ");
        bookRequestMap.forEach(BookApp::requestBook);
        // yep! It works! Gives exact same output as the first call to the method. Cool...

    } // end main()

    private static void requestBook(Book book, int quantity) {
        // simple implementation: for ONE book instance at a time:
        double price = book.getPricing(quantity);
        System.out.println("You have requested " + quantity + " copies of the book '" + book.getTitle() + "'");
        if (price > 0) { // sufficient copies of the book in stock !
            System.out.printf("The total cost will be: $%.2f%n%n", price);
        }
        else if (price == -1) {
            System.out.println("We're sorry. That book is out of stock.");
            System.out.println("isInStock returns: " + book.isInStock() + " and quantityInstock is: " + book.getQuantityInStock() + "\n");
        }
        else if (price == -2) {
            System.out.println("We're sorry, there are insufficient copies of that book available.");
            System.out.println("There are only " + book.getQuantityInStock() + " copies available.\n");
        }
        else {
            System.out.println("Sorry. Unknown response. book.getPricing("+quantity+") returned: " + price + "\n");
        }
    }

} // end BookApp class
