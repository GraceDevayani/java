import java.util.*;
class Mathp
{
    protected int number;
    protected void SetNumber(int num)
    {
        number=num;
    }
    protected int square()
    {
        return number *number;
    }
     protected int cube()
    {
        return number *number*number;
    }

}
class Result extends Mathp
{
    public void Calc()
    {
        System.out.println("square :"+square());
        System.out.println("cube :"+cube());
        
    }
}
public class pro {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in) ;
        Result obj=new Result();
        System.out.print("enter num");
        int input=s.nextInt();
        obj.SetNumber(input);
        obj.Calc();
    }
    
}
