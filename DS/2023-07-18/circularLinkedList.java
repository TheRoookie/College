public class circularLinkedList
{
    public static void main(String[] args)
    {
        linkedList l = new linkedList();
        // l.insertAtFirst(1);
        // l.insertAtFirst(2);
        // l.insertAtFirst(3);
        // l.insertAtFirst(4);
        // l.insertAtLast(99);
        // l.insertBeforeValue(66, 77);
        // l.insertAfterValue(44, 77);
        // l.delete(44);
        // l.delete(99);
        // l.deleteFirst();
        // l.deleteLast();
        l.insertAtFirst(1);
        l.insertAtLast(2);
        l.insertAtLast(3);
        l.insertAtLast(4);
        l.insertBeforeValue(50, 1);
        l.insertAfterValue(44, 4);
        l.deleteAtPos(88);
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

    void insertAtFirst(int data)
    {
        Node n = new Node(data);
        if(first==null)
        {
            first = n;
            n.next = n;
        }
        else
        {
            n.next = first;
            Node temp = first;
            while (temp.next!=first)
            {
                temp = temp.next;
            }
            temp.next = n;
            first = n;
        }
    }
    void insertAtLast(int data)
    {
        Node n = new Node(data);
        if(first==null)
        {
            first = n;
            n.next = n;
        }
        else
        {
            n.next = first;

            Node temp = first;
            while (temp.next!=first)
            {
                temp = temp.next;
            }
            //temp is at last element
            temp.next = n;
            //first = n;
        }
    }

    void insertBeforeValue(int data , int val)
    {
        Node n = new Node(data);
        if(first==null)
        {
            first = n;
            n.next = n;
        }
        else
        {
            
            Node temp = first;
            if(first.data==val)
            {
                insertAtFirst(data);
                return;
            }

            while(temp.next.data!=val && temp.next != first)
            {
                temp = temp.next;
            }
            if(temp.next==first)
            {
                System.out.println("Value not found! ");
            }
            else
            {
                n.next = temp.next;
                temp.next = n;
            }

            
        }
    }
    void insertAfterValue(int data , int val)
    {
        Node n = new Node(data);
        if(first==null)
        {
            first = n;
            n.next = n;
        }
        else
        {
            Node temp = first;
            while(temp.data!=val && temp.next != first)
            {
                temp = temp.next;
            }
            if(temp.next==first)
            {
                if(temp.data==val)
                {
                    insertAtLast(data);
                    return;
                }
                System.out.println("Value not found! ");
            }
            else
            {
                n.next = temp.next;
                temp.next = n; 
            }
            

            
        }
    }

    void delete(int data)
    {
        
        if(first==null)
        {
            System.out.println("List is empty!");
        }
        else
        {
            Node temp = first;
            while(temp.next.data!=data && temp.next!=first)
            {
                temp = temp.next;
            }
            if(temp.next==first)
            {
                System.out.println("Value not found!");
            }
            else
            {
                System.out.println("Deleted: "+ temp.next.data);
                temp.next = temp.next.next;
            }
            

            
        }
    }
    void deleteFirst()
    {
        
        if(first==null)
        {
            System.out.println("List is empty!");
        }
        else
        {
            first = first.next;

            Node tem = first;
            while (tem.next.next!=first)
            {
                tem = tem.next;
            }
            // tem is at last element

            tem.next = first;
        }
    }
    void deleteLast()
    {
        if(first==null)
        {
            System.out.println("List is empty!");
        }
        else
        {

            Node tem = first;
            while (tem.next.next!=first)
            {
                tem = tem.next;
            }
            // tem is at last element
            
            tem.next = first;  
        }
    }
    void deleteAtPos(int pos)
    {
        if(first==null)
        {
            System.out.println("List is empty!");
        }
        else
        {
            int count = 0;
            if(pos==0)
            {
                deleteFirst();
                return;
            }
            Node tem = first;
            while (count+1!=pos && tem.next != first)
            {
                tem = tem.next;
                count++;
            }
            if(tem.next == first)
            {
                System.out.println("Position Not found!");
            }
            else
            {
                tem.next = tem.next.next;
            }
        }
    }

    void display()
    {
        Node tem = first;
        while (tem.next!=first)
        {
            System.out.print(tem.data + " -> ");
            tem = tem.next;
        }
        System.out.println(tem.data);
    }
}