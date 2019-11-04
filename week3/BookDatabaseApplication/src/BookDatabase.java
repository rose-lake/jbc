/**
 * This will contain a pre-defined list of books
 * The "database" function is a method that takes one parameter (the SKU) and returns the populated Book instance.
 *
 * SINGLETON PATTERN
 * It seems most appropriate to set up this "database" as a singleton...
 * That will take care of the question of whether the given book has already been instantiated or not... (!)
 */

import java.util.HashMap;

public class BookDatabase {

    private HashMap<String, Book> databaseMap = new HashMap<String, Book>();

    public BookDatabase(){}

    public Book getBook(String SKU){

    }

}
