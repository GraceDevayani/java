import java.util.*;
class Fact
{
    int num;
    void val(int num)
    {
        this.num=num;
    }
    void fac()
    {
        int fac=1;
        for(int i=1;i<=n;i++)
        {
            fac*=i;
        }
        System.out.println("fact: "+fact);
    }
}
// child class
class Exte extends Fact
{
    int pow;
    void cal(int base,int pow)
    {
        this.base=base;
        this.pow=pow;
    }
    @Override
    void fac()
    {
        int res=1;
        for(int i=1;i<=pow;i++)
        {
            res+=num;
        }
        System.out.println("expo :"+res);
    }
}
public class overrifac {
    public static void main(String[] args )
    {
        Scanner s=new Scanner(System.in);
        System.out.print("enter values");
        int f=s.nextInt();
        Fact p=new Fact();
        p.val(f);
        p.fac();
        System.out.print("enter base");



    }
    
}
