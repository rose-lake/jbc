public class BookApp {
    public static void main(String[] args){
        Book bornACrime = new Book();
        bornACrime.setAuthor("Trevor Noah");
        bornACrime.setTitle("Born A Crime");
        bornACrime.setDescription("Trevor Noah's autobiography.");
        bornACrime.getDisplayText();
    }
}
