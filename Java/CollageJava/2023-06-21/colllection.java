/* Task 1 : Create a class book for adding list of book and returning the id and name of the book.
 * Task 2 : Add name and id of 4 books in array list and printing list of books
 * T3 : Printing array list using iterator.iterator merhod
*/

import java.util.ArrayList;

public class colllection
{
    public static void main(String[] args)
    {
        Book b1 = new Book(1, "Fuck");
        Book b2 = new Book(2, "You");
        Book b3 = new Book(3, "Mother");
        Book b4 = new Book(4, "Fucker");
        ArrayList<Book> Books = new ArrayList<>();
        Books.add(b1);
        Books.add(b2);
        Books.add(b3);
        Books.add(b4);
        for (int i = 0; i < Books.size() ; i++){
            
        }



    }
}
/**
 * Book
 */
class Book
{
    int id ;
    String name;
    Book(int id , String name)
    {
        this.id = id;
        this.name = name;
    }
    
}