import java.util.*;
interface Payment
{
    void processPayment(double amount);
}
class Creditcard implements Payment
{
    double amount;
    Creditcard(double a)
    {
        amount=a;
    }
     public void processPayment(double a)
    {
        System.out.println("Processing payment of $"+a+"via credit card");

    }
}
public class codegnan {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        double a=s.nextDouble();
        Creditcard p=new Creditcard(a);
        p.processPayment(a);
    }
    
}
