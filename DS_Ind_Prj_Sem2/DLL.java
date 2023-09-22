import java.util.Scanner;

public class DLL {
    static Scanner sc = new Scanner(System.in);
    static doublyLinkedList l = new doublyLinkedList();

    public static void main(String[] args) {

        int res = 0;
        System.out.println();
        System.out.println("Data Structure Individual Project.");
        System.out.println();
        System.out.println("Delete all values less than given value in Doubly Linked List.");
        System.out.println();
        while (true) {
            System.out.println("1 : Add Node");
            System.out.println("2 : Delete Node");
            System.out.println("3 : Delete Node less than given Value*****");
            System.out.println("4 : Display List");
            System.out.println("5 : Exit");

            while (true) {
                try {
                    res = sc.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("Enter a valid Number. Menu*");
                }
            }

            switch (res) {
                case 1:
                    insertMenu();
                    break;
                case 2:
                    deleteMenu();
                    break;
                case 3:
                    System.out.println("Enter Value : ");

                    while (true) {
                        try {
                            res = sc.nextInt();
                            break;

                        } catch (Exception e) {
                            System.out.println("Enter valid Number.");
                        }
                    }
                    l.deleteLessThan(res);
                    break;
                case 4:

                    display();

                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Enter a Valid number.");
                    break;
            }

        }
    }

    static void insertMenu() {

        int res = 0;
        while (true) {
            System.out.println("Insert Menu : ");
            System.out.println("1 : Insert At First");
            System.out.println("2 : Insert At Last");
            System.out.println("3 : Insert Before Given Value");
            System.out.println("4 : Insert After Given Value");
            System.out.println("5 : Insert Sorted");
            System.out.println("6 : Back");
            while (true) {
                try {
                    res = sc.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("Enter a Valid number.");
                }
            }
            switch (res) {
                case 1:
                    System.out.println("Enter Data : ");

                    while (true) {
                        try {
                            res = sc.nextInt();
                            break;
                        } catch (Exception e) {
                            System.out.println("Enter an Integer.");
                        }
                    }
                    l.insertAtFirst(res);
                    break;
                case 2:
                    System.out.println("Enter Data : ");

                    while (true) {
                        try {
                            res = sc.nextInt();
                            break;
                        } catch (Exception e) {
                            System.out.println("Enter an Integer.");
                        }
                    }
                    l.insertAtLast(res);
                    break;
                case 3:
                    System.out.println("Enter Data : ");
                    int res3 = 0;
                    while (true) {
                        try {
                            res = sc.nextInt();
                            break;
                        } catch (Exception e) {
                            System.out.println("Enter an Integer.");
                        }
                    }
                    System.out.println("Enter value to insert before.");
                    while (true) {
                        try {
                            res3 = sc.nextInt();
                            break;
                        } catch (Exception e) {
                            System.out.println("Enter an Integer.");
                        }
                    }

                    l.insertBeforeValue(res, res3);
                    break;
                case 4:
                    System.out.println("Enter Data : ");
                    int res4 = 0;
                    while (true) {
                        try {
                            res = sc.nextInt();
                            break;
                        } catch (Exception e) {
                            System.out.println("Enter an Integer.");
                        }
                    }
                    System.out.println("Enter value to insert after.");
                    while (true) {
                        try {
                            res4 = sc.nextInt();
                            break;
                        } catch (Exception e) {
                            System.out.println("Enter an Integer.");
                        }
                    }

                    l.insertAfterValue(res, res4);
                    break;
                case 5:
                    System.out.println("Enter Data : ");

                    while (true) {
                        try {
                            res = sc.nextInt();
                            break;
                        } catch (Exception e) {
                            System.out.println("Enter an Integer.");
                        }
                    }
                    l.insertSorted(res);
                    break;
                case 6:

                    return;
                default:
                    System.out.println("Oops... Try Again!");
                    break;
            }

        }

    }

    static void deleteMenu() {

        int res = 0;
        while (true) {
            System.out.println("Delete Menu : ");
            System.out.println("1 : Delete First");
            System.out.println("2 : Delete Last");
            System.out.println("3 : Delete Given Value");
            System.out.println("4 : Back");

            while (true) {
                try {
                    res = sc.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("Enter a Valid number.");
                }
            }
            switch (res) {
                case 1:

                    l.deleteFirst();
                    break;
                case 2:

                    l.deleteLast();
                    break;
                case 3:
                    System.out.println("Enter Value to be deleted : ");

                    while (true) {
                        try {
                            res = sc.nextInt();
                            break;
                        } catch (Exception e) {
                            System.out.println("Enter an Integer.");
                        }
                    }

                    l.deleteValue(res);

                    break;
                case 4:
                    return;

                default:
                    System.out.println("Oops... Try Again!");
                    break;
            }

        }
    }

    static void display() {
        int res = 0;
        while (true) {
            System.out.println("1 : Display List");
            System.out.println("2 : Display Reversed");
            System.out.println("3 : Back");
            try {
                res = sc.nextInt();
                switch (res) {
                    case 1:
                        System.out.println();
                        l.display();
                        System.out.println();

                        break;
                    case 2:
                        System.out.println();
                        l.displayReverse();
                        System.out.println();
                        break;
                    case 3:
                        return;

                    default:
                        System.out.println("Enter a Valid number.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Enter an Integer.");
            }

        }
    }
}

class doublyLinkedList {
    class Node {
        Node pre;
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.pre = null;
        }
    }

    Node first = null;

    void insertAtFirst(int data) {
        Node n = new Node(data);

        if (first == null) {
            first = n;
        } else {
            n.next = first;
            first.pre = n;
            first = n;
        }
    }

    void insertAtLast(int data) {
        Node n = new Node(data);

        if (first == null) {
            first = n;
        } else {
            Node tem = first;
            while (tem.next != null) {
                tem = tem.next;
            }
            tem.next = n;
            n.pre = tem;
        }
    }

    void insertBeforeValue(int data, int val) {
        Node n = new Node(data);

        if (first == null) {
            first = n;
        } else {
            Node tem = first;
            while (tem != null) {
                if (tem.data == val) {
                    if (tem == first) {
                        insertAtFirst(data);
                        return;
                    }
                    n.next = tem;
                    tem.pre.next = n;
                    n.pre = tem.pre;
                    tem.pre = n;
                    return;
                }
                tem = tem.next;
            }
            System.out.println("Value Not found");
        }
    }

    void insertAfterValue(int data, int val) {
        Node n = new Node(data);

        if (first == null) {
            first = n;
        } else {
            Node tem = first;
            while (tem != null) {
                if (tem.data == val) {
                    n.next = tem.next;
                    n.pre = tem;
                    tem.next.pre = n;
                    tem.next = n;

                    return;
                }
                tem = tem.next;
            }
            System.out.println("Value Not found");
        }
    }

    void insertSorted(int data) {
        Node n = new Node(data);

        if (first == null) {
            first = n;
        } else {
            Node tem = first;
            while (tem != null) {
                if (data <= tem.data) {
                    insertBeforeValue(data, tem.data);
                    return;
                }

                tem = tem.next;
            }
            insertAtLast(data);

        }
    }

    void deleteFirst() {
        if (first == null) {
            System.out.println("List is Empty!");
        } else if (first.next == null) {

            System.out.println(first.data + " Deleted.");
            first = null;

        } else {
            System.out.println(first.data + " Deleted.");
            first.next.pre = null;
            first = first.next;
        }
    }

    void deleteLast() {
        if (first == null) {
            System.out.println("List is Empty!");
        } else {
            Node tem = first;
            while (tem.next != null) {
                tem = tem.next;
            }
            System.out.println(tem.data + " Deleted.");
            tem.pre.next = null;
            tem = null;

        }
    }

    void deleteLessThan(int data) {
        if (first == null) {
            System.out.println("List is Empty!");
        } else {
            Node tem = first;
            while (tem != null) {
                if (tem.data < data) {
                    if (tem == first) {
                        deleteFirst();
                    } else if (tem.next == null) {
                        deleteLast();
                    } else {
                        tem.pre.next = tem.next;
                        tem.next.pre = tem.pre;
                    }
                }
                tem = tem.next;
            }
        }
    }

    void deleteValue(int data) {
        if (first == null) {
            System.out.println("List is Empty!");
        } else {
            Node tem = first;
            while (tem != null) {
                if (tem.data == data) {
                    if (tem == first) {
                        deleteFirst();
                        return;
                    }
                    if (tem.next == null) {
                        deleteLast();
                        return;
                    }
                    System.out.println("First " + tem.data + " deleted.");

                    tem.pre.next = tem.next;
                    tem.next.pre = tem.pre;
                    tem = null;

                    return;
                }
                tem = tem.next;
            }
            System.out.println("Value Not Found!");
        }
    }

    void display() {
        Node tem = first;
        if (first == null) {
            System.out.println("List is empty.");
        }
        while (tem != null) {
            System.out.print(tem.data + " -> ");
            tem = tem.next;
        }
        System.out.println("null");
    }

    void displayReverse() {
        Node tem = first;
        if (first == null) {
            System.out.println("List is empty.");
        }
        while (tem.next != null) {
            tem = tem.next;
        }
        while (tem != null) {
            System.out.print(tem.data + " -> ");
            tem = tem.pre;
        }
        System.out.println("null");
    }

}