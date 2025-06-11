import java.util.*;
class Super{
    int factorial(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact*=i;
        }
        return fact;
    }
    long clafac(int n)
    {
        long sf=1;
        for(int i=1;i<=n;i++)
        {
            sf*=factorial(i);
        }
        return sf;
    }
}
public class superfac {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        Super o=new Super();
        System.out.print("enter num : ");
        int a=s.nextInt();
        long res=o.clafac(a);
        System.out.print("superfac of "+a+ "is" +res);
    }
    
}
