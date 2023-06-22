


public class p1 
{
    public static void main(String[] args) 
    {
        linkedList l = new linkedList();
        for (int i = 0; i < 10 ; i++) 
        {
            l.sortAssInsert(i);
            //l.sortDecInsert(i);
            
            
            // l.sortInsert(i+3);
            
        }
        // l.delFirst();
        // l.delFirst();
        // l.delLast();
        //l.delValue(13);
        l.delAt(3);

        l.display();
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

    void sortAssInsert(int data)
    {
        Node n = new Node(data);
        if (first == null || first.data >= n.data) 
        {
            n.next = first;
            first = n;
        } 
        else 
        {
            Node temp = first;
            while (temp.next!=null && temp.next.data < n.data ) 
            {
                temp = temp.next;
            }
            n.next = temp.next;
            temp.next = n;
        }
    }
    void sortDecInsert(int data)
    {
        Node n = new Node(data);
        if (first == null || first.data <= n.data) 
        {
            n.next = first;
            first = n;
        } 
        else 
        {
            Node temp = first;
            while (temp.next!=null && temp.next.data > n.data ) 
            {
                temp = temp.next;
            }
            n.next = temp.next;
            temp.next = n;
        }
    }
    void delFirst()
    {
        if(first==null)
        {
            System.out.println("Empty List");

        }
        else
        {
            Node del = first;
            System.out.println("Deleted First : " + first.data);
            first = first.next;
            del.next = null;
        }
    }
    void delAt(int pos)
    {
        if(first==null)
        {
            System.out.println("Empty List");
            return;
        }
        int count = 0 ;
        Node dummy = first;
        while (dummy.next!=null)
        {
            dummy = dummy.next;
            count++;
        }
        //System.out.println(count+" Elements Found!");
        if(count<pos)
        {
            System.out.println("Index Not FOUND!");
        }
        else
        {
            count =0;
            Node temp = first;
            while (temp.next!=null) {
                if(count+1 == pos)
                {
                    System.out.println("Element to be deleted : "+temp.data);
                    temp.next = temp.next.next;
                    return;
                }
                temp = temp.next;
                count++;
            }
        }

    }
    void delValue(int value)
    {
        if(first==null)
        {
            System.out.println("Empty List");

        }
        else
        {
            int flag = 0;
            Node dummy = first;
            while (dummy!=null) 
            {
                if(dummy.data==value)
                {
                    flag++;
                }
                dummy = dummy.next;
            }
            if(flag==0)
            {
                System.out.println("Value is not found!");
            }
            else
            {
                if(first.data == value)
                {
                    Node del = first;
                    first = first.next;
                    del.next = null;
                }
                else
                {
                    for (int i = 0; i < flag; i++)
                    {
                        Node temp = first;
                        while (temp.next.data!=value) 
                        {
                            temp = temp.next;
                        }
                        Node q = temp.next;
                        temp.next=q.next;
                        q.next=null;
                    }
                }
            }
        }

    }
    void delLast()
    {
        if(first==null)
        {
            System.out.println("Empty List");

        }
        else
        {
            if(first.next==null)
            {
                System.out.println("Deleted Last form list of 1 element : " + first.data);
                first = null;
            }
            else
            {
                Node temp = first;
                while (temp.next.next != null) 
                {
                    temp = temp.next;
                }
                System.out.println("Deleted Last : " + temp.next.data);
                temp.next = null;
            }
        }
    }







    void display()
    {
        Node temp = first;
        
        while (temp!=null)
        {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
        
    }

}