import java.util.*;
class Arthemetic
{
    void preform()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("enter two num");
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.print("Addition: "+(a+b));
        System.out.print("sub: \n"+(a-b));
        System.out.print("mul:\n "+(a*b));
        System.out.print("div: \n"+(a/b));
    }
    
    
}
public class cla {
    public static void main(String[] args)
    {
        Arthemetic obj=new Arthemetic();
        obj.preform();
    }

    
}
