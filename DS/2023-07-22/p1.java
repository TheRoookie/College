

public class p1 
{
    public static void main(String[] args)
    {
        doublyLinkedList l = new doublyLinkedList();
        
        l.insertSorted(4);
        l.insertSorted(5);
        l.insertSorted(3);
        l.insertSorted(1);
        l.insertSorted(2);
        l.insertSorted(6);
        
        l.display();
    }
}
class doublyLinkedList
{
    class Node
    {
        Node pre;
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
            this.pre = null;
        }
    }
    Node first = null;
    void insertAtFirst(int data)
    {
        Node n = new Node(data);
        
        if(first==null)
        {
            first=n;
        }
        else
        {
            n.next=first;
            first.pre=n;
            first=n;
        }
    }
    void insertAtLast(int data)
    {
        Node n = new Node(data);
        
        if(first==null)
        {
            first=n;
        }
        else
        {
            Node tem = first;
            while (tem.next!=null)
            {
                tem = tem.next;
            }
            tem.next=n;
            n.pre=tem;
        }
    }
    void insertBeforeValue(int data , int val)
    {
        Node n = new Node(data);
        
        if(first==null)
        {
            first=n;
        }
        else
        {
            Node tem = first;
            while (tem!=null)
            {
                if(tem.data==val)
                {
                    if(tem==first)
                    {
                        insertAtFirst(data);
                        return;
                    }
                    n.next = tem;
                    tem.pre.next=n;
                    n.pre=tem.pre;
                    tem.pre=n;
                    return;
                }
                tem = tem.next;
            }
            System.out.println("Value Not found");
        }
    }
    void insertAfterValue(int data , int val)
    {
        Node n = new Node(data);
        
        if(first==null)
        {
            first=n;
        }
        else
        {
            Node tem = first;
            while (tem!=null)
            {
                if(tem.data==val)
                {
                    n.next=tem.next;
                    n.pre=tem;
                    tem.next.pre=n;
                    tem.next=n;

                    return;
                }
                tem = tem.next;
            }
            System.out.println("Value Not found");
        }
    }
    void insertSorted(int data)
    {
        Node n = new Node(data);
        
        if(first==null)
        {
            first=n;
        }
        else
        {
            Node tem = first;
            while (tem!=null)
            {
                if(data<=tem.data)
                {
                    insertBeforeValue(data, tem.data);
                    return;
                }
                
                tem = tem.next;
            }
            insertAtLast(data);
            
        }
    }
    void deleteFirst()
    {
        if(first==null)
        {
            System.out.println("List is Empty!");
        }
        else
        {
            first.next.pre = null;
            first=first.next;
        }
    }
    void deleteLast()
    {
        if(first==null)
        {
            System.out.println("List is Empty!");
        }
        else
        {
            Node tem = first;
            while (tem.next!=null)
            {
                tem = tem.next;
            }
            tem.pre.next = null;
            tem=null;

        }
    }
    void deleteValue(int data)
    {
        if(first==null)
        {
            System.out.println("List is Empty!");
        }
        else
        {
            Node tem = first;
            while (tem!=null)
            {
                if(tem.data == data)
                {
                    if(tem==first)
                    {
                        deleteFirst();
                        return;
                    }
                    if(tem.next==null)
                    {
                        deleteLast();
                        return;
                    }
                    
                    tem.pre.next=tem.next;
                    tem.next.pre=tem.pre;
                    tem=null;
                    
                    return;
                }
                tem = tem.next;
            }
            System.out.println("Value Not Found!");
        }
    }













    void display()
    {
        Node tem = first;
        if(first==null)
        {
            System.out.println("List is empty.");
        }
        while (tem!=null) 
        {
            System.out.print(tem.data + " -> ");
            tem = tem.next;
        }
        System.out.println("null");
    }
    void displayReverse()
    {
        Node tem = first;
        if(first==null)
        {
            System.out.println("List is empty.");
        }
        while (tem.next!=null) {
            tem=tem.next;
        }
        while (tem!=null) 
        {
            System.out.print(tem.data + " -> ");
            tem = tem.pre;
        }
        System.out.println("null");
    }

}