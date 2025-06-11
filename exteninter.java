//accesing one interface extending another accessing
import java.util.*;
interface BasicOperations//parent interface
{
    void add(int a,int b);
}
interface AdvOperations extends BasicOperations//derived interface
{
    void multiply(int a,int b);
}
class Calculator implements AdvOperations{
    public void add(int a,int b)
    {
        System.out.print("\nadd: "+(a+b));
    }
    public void multiply(int a,int b)
    {
        System.out.print("\nmul: "+(a*b));
    }

}
public class exteninter {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("enter a");
        int a=s.nextInt();
        System.out.print("enter b");
        int b=s.nextInt();
        System.out.print("obj accessing and implementing");
        Calculator c=new Calculator();
        c.add(a,b);
        c.multiply(a,b);
        s.close();

    }
    
}
