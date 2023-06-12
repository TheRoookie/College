
/*
    Fix 10 tickets 2 threads ,1 book 5 ticket other book 7 tic at same time.

 */

public class moreMovies
{
    public static void main(String[] args) 
    {
        bookTheTicket s = new bookTheTicket();
        bookingAppp a = new bookingAppp(s,5);
        bookingAppp b = new bookingAppp(s,7);
        a.setName("FastX");
        b.setName("Gardians");
        a.start();
        b.start();
    }
}
class bookingAppp extends Thread
{
    bookTheTicket b ;
    int seats = 0 ;
    bookingAppp(bookTheTicket b , int seats)
    {   
        this.b = b;
        this.seats = seats;
    }
    public void run() 
    {
        Thread t = Thread.currentThread();
        String mName = t.getName();
        
        if(mName.equals("FastX"))
        {
            b.bookFastX(seats);
        }
        if(mName.equals("Gardians"))
        {
            b.bookGardians(seats);
        }
    }
}

class bookTheTicket
{
    int total_ticket = 30;
    int ticket_left=total_ticket;
    synchronized void bookFastX(int seats)
    {
        Thread t = Thread.currentThread();
        if(ticket_left>=seats)
        {
            
            System.out.println("Hello : "+t.getName() + " : Your ticket is Booked");
            ticket_left=ticket_left-seats;
            System.out.println("Available seats : "+ticket_left);
        }
        else
        {
            System.out.println("Sorry : "+t.getName()+" Your Booking Failed.");
            System.out.println("Available seats : "+ticket_left);
        }
    }
    synchronized void bookGardians(int seats)
    {
        Thread t = Thread.currentThread();
        if(ticket_left>=seats)
        {
            
            System.out.println("Hello : "+t.getName() + " : Your ticket is Booked");
            ticket_left=ticket_left-seats;
            System.out.println("Available seats : "+ticket_left);
        }
        else
        {
            System.out.println("Sorry : "+t.getName()+" Your Booking Failed.");
            System.out.println("Available seats : "+ticket_left);
        }
    }
    
}