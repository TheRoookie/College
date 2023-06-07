public class customExept
{
    public static void main(String[] args)
    {
        //throw new myExecption();
        throw new myExecption("Exeption Occored WTF");
    }
}
class myExecption extends RuntimeException
{
    myExecption()
    {
        super("Auto WTF");
    }
    myExecption(String s)
    {
        super(s);
    }
}