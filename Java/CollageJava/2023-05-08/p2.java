abstract class Vegtable
{
    String vegColor;
    public abstract String toString();
    {

    }
}

class potato extends Vegtable
{
    
    public String toString()
    {
        vegColor = " Yellow";
        return "Potato"+vegColor;
    }
}

class bringle extends Vegtable
{
    //super.vegColor = "" ;
    public String toString()
    {
        vegColor = " Purple";
        return "Potato"+vegColor;
    }
}
class tomato extends Vegtable
{
    //super.vegColor = " Red";
    public String toString()
    {
        vegColor = " Red";
        return "Tomato"+vegColor;
    }
}
class p2
{
    public static void main(String[] args)
    {
        Vegtable p = new potato();
        System.out.println(p);


    }
}