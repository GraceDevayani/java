import java.util.*;
interface Area
{
    double Carea();
}
interface Perimeter{
    double Cperimeter();
}
//implement interface area and perimeter in class called rectangle
class Rectangle implements Area,Perimeter
{
    double length;
    double breadth;
    Rectangle(double length,double breadth)//constructor
    {
        this.length=length;
        this.breadth=breadth;
    }
    // implementation
    public double Carea()
    {
        return length*breadth;
    }
    public double Cperimeter(){
        return (2*(length+breadth));
    }
}
public class multiinter {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("enter len");
        double length=s.nextDouble();
        System.out.print("enter breadth");
        double breadth=s.nextDouble();
        Rectangle r=new Rectangle(length, breadth);
        System.out.println("Area :"+r.Carea());
        System.out.println("Perimeter :"+r.Cperimeter());
        s.close();
    }
    
}
