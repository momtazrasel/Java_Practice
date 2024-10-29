import java.util.ArrayList;

public class Book extends DateFormate{
    private String title;
    private String author;
    private String ISBN;
    private static DateFormate date;

    private static ArrayList <Book> bookCollection = new ArrayList<Book>();
    public Book(String title, String author, String ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;

    }

    public String getTitle(){
        return title;
    }
//    public void setTitle(){
//        this.title = title;
//    }
    public String getAuthor(){
        return title;
    }
    public void setAuthor(){
        this.title = title;
    }
    public String getISBN(){
        return title;
    }
    public void setISBN(){
        this.title = title;
    }
    public static void addBook(Book book){
        bookCollection.add(book);
    }
    public static ArrayList <Book> getBookCollection(){
        return bookCollection;
    }

    public void removeBook(){
        
    }

    public static void main(String[] args) {
        Book obj = new Book("Himu","Humayon Ahmed" , "Bangla bajar");
        Book objOne = new Book("Himu Timu","Humayon Ahmed" , "Bangla bajar");
        System.out.println(obj.getTitle());
        Book.addBook(obj);
        Book.addBook(objOne);
        date.getDateFormate();
//        System.out.println(obj.addBook(obj));
        ArrayList <Book> bookCollection = Book.getBookCollection();
        System.out.println("Book Lists:");
        for (Book book:bookCollection){
            System.out.println(book.getTitle() + " by " + book.getAuthor() + " ISBN " + book.getISBN());
            System.out.println(book.getTitle() + " by " + book.getAuthor() + " ISBN " + book.getISBN());
        }

    }
}
