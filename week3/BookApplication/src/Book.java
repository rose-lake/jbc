public class Book {
    protected String title, author, description;
    protected double price;
    protected boolean inStock;

    // default constructor
    public Book(){};

    // overloaded constructor
    public Book(String title, String author, String description, double price, boolean inStock){
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.inStock = inStock;
    }

    public void getDisplayText(){
        System.out.println("Author: " + author + "\nTitle: " + title + "\nDescription: " + description);
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

}
