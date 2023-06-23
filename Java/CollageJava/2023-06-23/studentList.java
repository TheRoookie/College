import java.util.ArrayList;
import java.util.Scanner;



class Student 
{
    String name;
    int grade;
    public Student(String name, int grade) 
    {
        this.name = name;
        this.grade = grade;
    }
    public String getName() {
        return name;
    }
    public int getGrad()
    {
        return grade;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", grade=" + grade + "]";
    }
    

    

    
    
}
class stdManageSys
{
    ArrayList<Student> students;
    public stdManageSys()
    {
        students = new ArrayList<>();
    }
    void addStudent(String name , int grade)
    {
        students.add(new Student(name, grade));
    }
    void removeStd(String name)
    {
        Student s=null;
        for (Student s1 : students) {
            if (s1.getName().equals(name)) {
                s=s1;
                break;
            }
        }
        if (s!=null) {
            students.remove(s);
        } else {
            System.out.println("The MF not found!!!");
        }
    }
    void serchStd(String name)
    {
        
    }
    void sortByName()
    {
        
    }
    void sortByGrade()
    {
        
    }
    public static void main(String[] args) 
    {
        stdManageSys sms = new stdManageSys();
        Scanner sc = new Scanner(System.in);
        String choice;
        do 
        {
            System.out.println("1 : To add Student.");
            System.out.println("2 : To Remove Student");
            System.out.println("3 : To Search Student");
            System.out.println("4 : For Sort by Name");
            System.out.println("5 : For sort by Grade");
            System.out.println("6 : To exit.");
            System.out.println("Enter Your choice");
            choice = sc.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("NAme??");
                    String name = sc.nextLine();
                    System.out.println("Grade??");
                    int grad = sc.nextInt();
                    sms.addStudent(name, grad);
                    sc.nextLine();
                    break;
                case "2":
                    System.out.println("Enter name to remove :");
                    name = sc.nextLine();
                    sms.removeStd(name);
                    break;
                case "6":
                    System.exit(0);
                    break;
            
                default:
                    break;
            }

        } while (true);
    }
}