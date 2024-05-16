public class Book {
    private String title;
    private String author;
    private String ISBN;

    public Book(String title, String author, String ISBN){
        this.title = title;
        this.author = author;
        this.author = author;

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
    public void addBook(){

    }

    public void removeBook(){
        
    }

    public static void main(String[] args) {
        Book obj = new Book("Himu","Humayon Ahmed" , "Bangla bajar");
        System.out.println(obj.getTitle());
    }
}
