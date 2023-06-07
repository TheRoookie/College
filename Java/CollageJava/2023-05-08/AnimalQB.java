interface Transport
{
    void deliver();
    
}
abstract class Animal
{
    void display(){}
}
class tiger extends Animal
{
    void display()
    {
        System.out.println("tigerooooo");
    }
}
class camel extends Animal implements Transport
{
    public void deliver()
    {
        System.out.println("Diliver");
    }
    void display()
    {
        System.out.println("camelooooo");
    }
}
class deer extends Animal
{
    void display()
    {
        System.out.println("Deerooooo");
    }
}
class donkey extends Animal implements Transport
{
    public void deliver()
    {
        System.out.println("Deliver");
    }
}

public class AnimalQB
{
    public static void main(String[] args)
    {
        
        Animal[] a = new Animal[4];
        
        a[0] = new tiger();
        a[1] = new camel();
        a[2] = new deer();
        a[3] = new donkey();
        
        for (int i = 0; i < a.length; i++)
        {
            //System.out.println(a[i]);
            a[i].display();
            if(a[i] instanceof Transport)
            {
                ((Transport)a[i]).deliver();
            }
        }
        System.out.println("Done");
        for(Animal i : a)
        {
            if(i instanceof Transport)
            {
                ((Transport)i).deliver();
            }
        } 

    }
}
