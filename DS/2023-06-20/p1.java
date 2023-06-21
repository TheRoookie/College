public class p1 
{
    public static void main(String[] args) 
    {
        linkedList l1 = new linkedList();
        linkedList l2 = new linkedList();
        l1.insertAtLast(10);
        l1.insertAtLast(20);
        l2.insertAtLast(30);
        l2.insertAtLast(41);
        l1.insertAtLast(50);
        l1.insertBeforeLast(40);
        l1.insertAtFirst(60);
        l2.insertAfterFirst(70);
        //l1.display();
        //l1.recursiveDisplay(l1.first);
        //l1.mergeLists(l1, l2);
        
        //l.oddDisplay();
        //l.oddPosDisplay();
        l1.display();



    }
}

class linkedList
{
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    Node first = null;
    
    void mergeLists(linkedList a , linkedList b)
    {
        Node temp = a.first;
        while (temp.next!=null) 
        {
            temp = temp.next;
        }
        temp.next=b.first;
        //a.display();
    }
    
    void insertAtFirst(int data)
    {
        Node n = new Node(data);
        if(first == null)
        {
            first = n;
        }
        else
        {
            n.next=first;
            first = n;
        }
    }



    void insertAfterFirst(int data)
    {
        Node n = new Node(data);
        if(first == null)
        {
            first = n;
        }
        else
        {
            n.next = first.next;
            first.next = n;

        }
    }

    void insertBeforeLast(int data)/*************************PENDING****************************/
    {
        Node n = new Node(data);
        Node temp = first;
        if(first == null)
        {
            first = n;
        }
        else
        {
            while (temp.next.next!=null) 
            {
                temp = temp.next;
            }
            n.next = temp.next;
            temp.next = n;
        }
        
    }

    void insertAtLast(int data)
    {
        Node n = new Node(data);
        Node temp = first;
        if(first == null)
        {
            first = n;
        }
        else
        {
            while (temp.next!=null) 
            {
                temp = temp.next;
            }
            temp.next=n;
        }
    }

    void display()
    {
        Node temp = first;
        
        while (temp!=null) 
        {
            System.out.print(temp.data + " --> ");
            temp = temp.next;

        }
        System.out.println("NULL");
        
    }
    void recursiveDisplay(Node temp)
    {
        
        if(temp==null)
        {
            System.out.println("NULL");
            return;
        }
        else
        {
            System.out.print(temp.data + " --> ");
            recursiveDisplay(temp.next);
        }
        //System.out.println("NULL");
        
    }
    void displayWithSumCount()
    {
        Node temp = first;
        int sum = 0;
        int count = 0;
        while (temp!=null) 
        {
            sum = sum + temp.data;
            count++;
            System.out.print(temp.data + " --> ");
            temp = temp.next;

        }
        System.out.println("NULL");
        System.out.println("Sum = " + sum);
        System.out.println("Count = " + count);
    }
    void oddDisplay()
    {
        Node temp = first;
        
        while (temp!=null) 
        {
            
            if (temp.data%2!=0)
            {
                System.out.print(temp.data + " --> ");
            }
            temp = temp.next;

        }
        System.out.println("NULL");
        
    }
    void oddPosDisplay()
    {
        Node temp = first;
        
        int pos = 1;
        while (temp!=null) 
        {
            
            if (pos%2!=0)
            {
                System.out.print(temp.data + " --> ");
            }
            pos++;
            temp = temp.next;

        }
        System.out.println("NULL");
        
    }
    
}