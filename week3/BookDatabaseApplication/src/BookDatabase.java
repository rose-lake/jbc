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

    private static BookDatabase single_instance = null;

    private HashMap<String, Book> databaseMap = new HashMap<String, Book>();

    // SINGLETON constructor is PRIVATE
    private BookDatabase(){
        // this only ever gets called inside of getInstance(),
        // and then, only if the private static single_instance is null!

        //*****************************
        // build our book database, as specified in the assignment description on canvas
        //*****************************
        int qty = 8;        // default quantityInStock amount
        Book b1 = new Book("Head First Java", "Kathy Sierra and Bert Bates",
                "Easy to read Java workbook", 47.50, qty);
        String sku1 = "Java1001";
        Book b2 = new Book("Thinking in Java", "Bruce Eckel",
                "Details about Java under the hood", 20.00, qty);
        String sku2 = "Java1002";
        Book b3 = new Book("OCP: Oracle Certified Professional Java SE", "Jeanne Boyarsky",
                "Everything you need to know in one place", 45.00, qty);
        String sku3 = "Orcl1003";
        Book b4 = new Book("Automate the Boring Stuff with Python", "Al Sweigart",
                "Fun with Python", 10.50, qty);
        String sku4 = "Python1004";
        Book b5 = new Book("The Maker's Guide to the Zombie Apocalypse", "Simon Monk",
                "Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi", 16.50, qty);
        String sku5 = "Zombie1005";
        Book b6 = new Book("Raspberry Pi Projects for the Evil Genius", "Donald Norris",
                "A dozen fiendishly fun projects for the Raspberry Pi!", 14.75, qty);
        String sku6 = "Rasp1006";

        databaseMap.put(sku1, b1);
        databaseMap.put(sku2, b2);
        databaseMap.put(sku3, b3);
        databaseMap.put(sku4, b4);
        databaseMap.put(sku5, b5);
        databaseMap.put(sku6, b6);
    }

    public static BookDatabase getInstance(){
        if (single_instance == null) {single_instance = new BookDatabase();}
        return single_instance;
    }

    public Book getBook(String SKU){
        return databaseMap.get(SKU);
    }

    public HashMap<String, Book> getDatabaseMap(){
        return databaseMap;
    }

    @Override
    public String toString() {
        return "BookDatabase{" +
                "databaseMap=" + databaseMap +
                '}';
    }

}
