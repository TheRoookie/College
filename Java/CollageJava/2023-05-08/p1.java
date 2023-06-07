import java.util.*;

interface Bank//bank methods declaration
{
    void deposite();
    void withdraw();
    void loan();
    void ballanceCheck();






    
}

abstract class VillageBank implements Bank//partial implementation in village rest in next class
{
    public void deposite()
    {
        System.out.println("Deposite");


    }
    public void withdraw()
    {
        System.out.println("Withdraw");


    }
    
}


class CityBank extends VillageBank implements Bank //here* all the remaining methods completed
//extends also implements so the object can be made that has  access to all methods
{
    public void loan()
    {
        System.out.println("Loan");

    }
    public void ballanceCheck()
    {
        System.out.println("Balance");
    }

    
}

public class p1//final bank class
{

    public static final void main(String[] args)
    {
        CityBank c = new CityBank();//object of bank shoud not be made so, last class has all the properties of previous 2.

        int x= 10;
        int e = 20;
        Math.pow(x ,e);




    }
}