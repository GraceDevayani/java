import java.util.*;
public class except1 {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        try {
            System.out.print("enter n1");
            int n1=s.nextInt();
            System.out.print("enter n2 ");
            int n2=s.nextInt();
            int result=n1/n2;
            System.out.print("result: "+result);
        }
        catch(ArithmeticException e)
        {
             System.out.print("caught exception : division by zero");
        }
        finally {
            s.close();
        }
    }
    
}
