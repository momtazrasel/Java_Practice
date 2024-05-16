import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private String ISBN;

    private static ArrayList <Book> bookCollection = new ArrayList<Book>();
    public Book(String title, String author, String ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;

    }

    public String getTitle(){
        return title;
    }
    public void setTitle(){
        this.title = title;
    }
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

    public void removeBook(){
        
    }

    public static void main(String[] args) {
        Book obj = new Book("Himu","Humayon Ahmed" , "Bangla bajar");
        System.out.println(obj.getTitle());
    }
}
