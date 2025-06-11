import java.util.*;//override
//parent class
class Calc
{
    int a,b;
    void setValues(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    void calculate()
    {
        int sum=a+b;
        System.out.print("sum from parent:"+sum);
    }

}
//child class
class Extra extends Calc
{
    @Override
    void calculate()
    {
        int product =a*b;
        System.out.print("\npro from child:"+product);
    }
}
//main class
public class overrinum {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter num1 : ");
        int num1=s.nextInt();
        System.out.println("enter num2 : ");
        int num2=s.nextInt();
        Calc c=new Calc();
        c.setValues(num1,num2);
        c.calculate();//calls parents version of output
        Extra e=new Extra();
        e.setValues(num1,num2);
        e.calculate();//calls overriden values


    }
    
}
