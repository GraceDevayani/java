//method over riding(run time)

import java.util.*;
class Operation
{
    void calculate(int n)
    {
        System.out.println("general operation"+n);
    }
}
class Power extends Operation{
    void calculate(int n)
    {
         System.out.println("square of "+n+"is" +n*n);
    }
}
class Fact extends Operation
{
    void calculate(int n)
    {
        int fac=1;
        for(int i=1;i<=n;i++)
        {
            fac*=i;
        }
        System.out.println("fac of"+n+"is: "+fac);
    }
}
public class polyrun {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        Operation op;
        System.out.println("enter n");
        int n=s.nextInt();
        op=new Power();
        op.calculate(n);
        op=new Fact();
        op.calculate(n);
    }
    
}


    

