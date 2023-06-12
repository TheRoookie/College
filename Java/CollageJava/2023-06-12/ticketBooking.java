
/*
    Fix 10 tickets 2 threads ,1 book 5 ticket other book 7 tic at same time.

 */

public class ticketBooking
{
    public static void main(String[] args) 
    {
        bookTheTicket s = new bookTheTicket();
        bookingApp a = new bookingApp(s,5);
        bookingApp b = new bookingApp(s,7);
        a.setName("FU");
        b.setName("BI");
        a.start();
        b.start();
    }
}
class bookingApp extends Thread
{
    bookTheTicket b ;
    int seats = 0 ;
    bookingApp(bookTheTicket b , int seats)
    {   
        this.b = b;
        this.seats = seats;
    }
    public void run() 
    {
        b.book(seats);
    }
}

class bookTheTicket
{
    int total_ticket = 10;
    int ticket_left=total_ticket;
    synchronized void book(int seats)
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