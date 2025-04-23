package oops;

import java.util.Scanner;

public class BookManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        int input;
        do {
            System.out.println("1.Add books in the library");
            System.out.println("2. Replace Book");
            System.out.println("3. Display All Books");
            System.out.println("4. Search Book by ID");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
             input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Enter the bookID :");
                    int bookID = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the book title:");
                    String bookTitle = sc.nextLine();
                    System.out.println("Enter the book author:");
                    String bookAuthor = sc.nextLine();
                    System.out.println("enter the availability status");
                    boolean isAvailable = sc.nextBoolean();
                    library.addBook(new Book(bookID, bookTitle, bookAuthor, isAvailable));
                    break;
                case 2:
                    //int bookID,int newBookID,String newAuthor,String newTitle
                    System.out.println("Enter the bookId");
                    int bookId = sc.nextInt();
                    sc.nextLine();
                    System.out.println("enter the newbookid");
                    int newBookID = sc.nextInt();
                    sc.nextLine();
                    System.out.println("enter the new book author");
                    String newAuthor = sc.nextLine();
                    System.out.println("enter the newTitle ");
                    String newTitle = sc.nextLine();
                    library.replaceBook(bookId, newBookID,newAuthor,newTitle);
                    break;
                case 3:
                    library.display();
                    break;
                case 4:
                    System.out.println("enter the bookID");
                    int bookid = sc.nextInt();
                    Book found  = library.searchByBookId(bookid);
                    if(found != null){
                        System.out.println("the book "+found);
                    }
                    else{
                        System.out.println("not found");
                    }
                    break;

                case 0:
                    System.out.println("exit from here");
                    break;
                default:
                    System.out.println("invalid input");
                    break;
            }
            }while (input != 0);
        sc.close();
    }
}
