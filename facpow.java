import java.util.*;
class Input
{
    int a,b;
    void getInput(Scanner s)
    {
        System.out.print("enter a");
        a=s.nextInt();
        System.out.print("enter b");
        b=s.nextInt();

    }
}
class Power extends Input
{
    void power(){
        int result=1;
        for(int i=1;i<=b;i++)
        {
            result*=a;
        }
        System.out.print("power("+a+"^"+b+"):"+result);
    }
}
class Fact extends Power{
    int fac(int n)
    {
        int fac=1;
        for(int i=1;i<=n;i++)
        {
            fac*=i;
        }
    return fac;
    }
        void showFact()
        {
            System.out.println("fact of "+a+":"+fac(a));
            System.out.println("fact of "+b+":"+fac(b));
        }
    
}
public class facpow {
    public static void main(String[] args){
         Scanner s=new Scanner(System.in);
         Fact o=new Fact();
    o.getInput(s);
    System.out.println();
    o.power();
    o.showFact();

    }
   
    
}
