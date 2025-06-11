// declare interface 
import java.util.*;
interface Shape//interface name
{
    double area();
    double perimeter();
}
//implement interface shape in class called rectangle
class rectangle implements Shape
{
    double length;
    double breadth;
    rectangle(double l,double b)//constructor
    {
        length=l;
        breadth=b;
    }
    //implementation
    public double area()
    {
        return length*breadth;
    }
    public double perimeter()
    {
        return 2*(length+breadth);
    }
}
public class interfa {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("enter len");
        double length=s.nextDouble();
        System.out.print("enter breadth");
        double breadth=s.nextDouble();
        //creating an obj which calls method and pass args
        Shape r=new rectangle(length,breadth);
        System.out.println("Area :"+r.area());
        System.out.println("Perimeter :"+r.perimeter());
        s.close();
        
    }
    
}
