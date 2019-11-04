/**
 * Canvas Assignment: "Create a Book Database"
 *
 * Our class will simulate a database and return a populated book object.
 * We'll simulate a database by simply using if or switch statements to look up a book based on SKU.
 *
 * Our book database will contain several book titles and the SKU code to look one up.
 *
 * Create a class that contains a method that takes one parameter, the SKU, and returns a corresponding book object.
 * Use If Statements to populate the instance variables of the Book class and return the populated Book class.
 *
 */
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        BookDatabase myBookDB = BookDatabase.getInstance();
        // System.out.println("myBookDB :: \n" + myBookDB.toString());

        System.out.println("myBookDB's internal HashMap printed via forEach(lambda-defined-action) and using book.getDisplayText()");
        HashMap<String, Book> myMap = myBookDB.getDatabaseMap();
        myMap.forEach((sku, book) -> System.out.println("SKU :: \n\t" + sku + "\nBook :: \n" + book.getDisplayText()));

        // test code ::
        String mySKU1 = "Java1001";
        Book myBook1 = myBookDB.getBook(mySKU1);
        System.out.println("\n\nPrinting out myBookDB.getBook("+mySKU1+") using myBook.getDisplayText()");
        System.out.println("\n\nmyBook ::\n" + myBook1.getDisplayText());

        // looking for HashCode
        // this is super-cool because it verifies that my Singleton implementation **really works**!
        System.out.println("\n*** my book's hashCode ***\n\t" + myBook1.hashCode());
        Book myBookOne = myBookDB.getBook(mySKU1);
        System.out.println("\n*** my book 2's hashCode ***\n\t" + myBookOne.hashCode());

        // test code ::
        String mySKU2 = "Zombie1005";
        Book myBook2 = myBookDB.getBook(mySKU2);
        System.out.println("\n\nPrinting out myBookDB.getBook("+mySKU2+") using myBook.getDisplayText()");
        System.out.println("\n\nmyBook ::\n" + myBook2.getDisplayText());

    }

}
