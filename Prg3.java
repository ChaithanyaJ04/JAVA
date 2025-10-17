import java.util.Scanner;

class Book {
    String name;
    String author;
    int price;
    int numPages;
    
    // Parameterized constructor
    public Book(String name, String author, int price, int numPages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numPages = numPages;
    }
    
    // toString method to display complete details
    public String toString() {
        return "Book Name: " + this.name + "\n" +
               "Author: " + this.author + "\n" +
               "Price: " + this.price + "\n" +
               "Number of Pages: " + this.numPages + "\n";
    }
}

public class Prg3 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter number of books: ");
        int n = s.nextInt();
        s.nextLine(); // consume the newline character
        
        // Create array of Book objects
        Book[] books = new Book[n];
        
        // Read details for each book
        for(int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Book " + (i+1) + ":");
            
            System.out.print("Enter book name: ");
            String name = s.nextLine();
            
            System.out.print("Enter author name: ");
            String author = s.nextLine();
            
            System.out.print("Enter price: ");
            int price = s.nextInt();
            
            System.out.print("Enter number of pages: ");
            int numPages = s.nextInt();
            s.nextLine(); // consume the newline character
            
            // Create Book object and store in array
            books[i] = new Book(name, author, price, numPages);
        }
        
        // Display all book details
        System.out.println("\n--- Book Details ---");
        for(int i = 0; i < n; i++) {
            System.out.println("Book " + (i+1) + " details:");
            System.out.println(books[i].toString());
        }
        
        s.close();
    }
}