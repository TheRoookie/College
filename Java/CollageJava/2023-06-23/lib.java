import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;





public class lib
{

    public static void main(String[] args)
    {
        Book b1 = new Book(1, "Psycology of money");
        Book b2 = new Book(2, "Rich Dad Poor Dad");
        Book b3 = new Book(3, "Dark Psycology");
        Book b4 = new Book(4, "48 Laws of Power");

        
        
        ArrayList<Book> books = new ArrayList<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);

        
        
        Collections.sort(books,Comparator.comparing(Book::get_id));
        //System.out.println(books);
        Iterator I = books.iterator();
        while (I.hasNext()) {
            System.out.println(I.next());
        }

    }
}

class Book 
{
    int book_id;
    String book_name;
    public Book(int book_id, String book_name) 
    {
        this.book_id = book_id;
        this.book_name = book_name;
    }
    @Override
    public String toString() 
    {
        return "\nBook { book_id= " + book_id + " , book_name= " + book_name + " }";
    }
    int get_id()
    {
        return book_id;
    }
    String get_name()
    {
        return book_name;
    }
    
    
}