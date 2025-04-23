package oops;
public class Book{
    private int bookID;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(int bookID, String title, String author, boolean isAvailable) {

        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }
    public void setBookID(int bookID){
        this.bookID = bookID;

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String toString(){
        return "BOOKID :"+ bookID +"\n title: "+title+" \nauthor: "+author+"\n Available "+isAvailable ;
    }



}
class Library{
    Book []books;
    private int count = 0;

    public Library(){
        books = new Book[5];
        count = 0;

    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
            System.out.println("the books added successfully");

        } else {
            System.out.println("There is no space for adding books");
        }
    }

    public void replaceBook(int bookID,int newBookID,String newAuthor,String newTitle){
        for(int i = 0; i < count;i++){
            if(books[i].getBookID() == bookID){
                books[i].setBookID(newBookID);
                books[i].setTitle(newTitle);
                books[i].setAuthor(newAuthor);
                System.out.println("The book replaced");
                return ;
            }

        }
        System.out.println("The book"+ bookID +"not found");
    }

    public void display(){
        if(count == 0){
            System.out.println("there is no book in library");
        }
        else {
            for (int i = 0; i < count; i++) {
                System.out.println(books[i]);
            }
        }
    }

    public Book searchByBookId(int bookID){
        for(int i = 0; i < count ;i++){
            if(books[i].getBookID() == bookID){
                return books[i];
            }
        }
        return null;
    }


}
