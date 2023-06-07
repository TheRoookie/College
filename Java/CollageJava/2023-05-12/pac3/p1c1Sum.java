package pac3;//making/declaring package

import pac1.p1c1;
import pac2.p2c1;

public class p1c1Sum
{
    public int sum()
    {
        p1c1 c1 = new p1c1();
        p2c1 c2 = new p2c1();
        int x = c1.x;
        int y = c2.y;
        return (x+y);
    }
}
