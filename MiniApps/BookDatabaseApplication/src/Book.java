/**
 * This Book class defines a single book instance for the BookDatabase HashMap
 */
public class Book {
    protected String title;
    protected String author;
    protected String description;
    protected double price;
    protected boolean inStock;
    protected int quantityInStock;

    // default constructor
    public Book(){};

    // (partly)overloaded constructor
    // taking out the inStock parameter on constructor... May add it in later for further functionality,
    // but at this time its value will be regulated (on construction) by the quantityInStock amount.
    public Book(String title, String author, String description, double price, int quantityInStock){
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.quantityInStock = quantityInStock;
        // inStock depends on quantityInStock value being greater than zero.
        this.inStock = this.quantityInStock >= 1;
    }

    //****************************************************************************
    // This method returns a string containing the author, title and description.
    //****************************************************************************
    public String getDisplayText(){
        return "\tAuthor: " + author + "\n\tTitle: " + title + "\n\tDescription: " + description;
    }

    // *************
    // all getters
    // *************
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getDescription(){
        return description;
    }
    public double getPrice(){
        return price;
    }
    public boolean isInStock(){
        return inStock;
    }
    public int getQuantityInStock(){
        return quantityInStock;
    }

    // *************
    // all setters
    // *************
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setInStock(boolean inStock){
        this.inStock = inStock;
    }
    public void setQuantityInStock(int quantityInStock){
        this.quantityInStock = quantityInStock;
        this.inStock = quantityInStock >= 1;    // IDE-suggested code for setting boolean from quantity >= 1
    }

    // ************************************************************************
    // Book Class Pricing Method Assignment (from Canvas)
    // Create a method that returns the pricing for a requested number of books.
    // Five books at $20.00 should return $100, if they are in stock.
    // If they are not in stock, that should be handled appropriately (hint - you decide).
    // ************************************************************************
    // Implementation:
    //      numRequested MUST BE an INTEGER > 0
    //      this method returns price for a given number of this book instance,
    //          so long as sufficient copies of the book are inStock !
    //      if book is not in stock return -1
    //      if a few copies are in stock, but not as many as requested, return -2
    // ************************************************************************
    public double getPricing(int numRequested){
        if (inStock) {
            if (numRequested <= quantityInStock){
                return price * numRequested;
            }
            else {
                return -2;
            }
        }
        else {
            return -1;
        }
    }

    //********************
    // toString override
    //********************
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", inStock=" + inStock +
                ", quantityInStock=" + quantityInStock +
                '}';
    }
}
