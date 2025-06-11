import java.util.*;//lambda operation
@FunctionalInterface
interface Operation{
    int compute(int a,int b);
}
public class lam {
    public static void main(String[] args)
    {
    Scanner s=new Scanner(System.in);
    System.out.println("enter value of x and y");
    int x=s.nextInt();
    int y=s.nextInt();
    Operation add=(a,b)->a+b;
    Operation sub=(a,b)->a-b;
    Operation mul=(a,b)->a*b;
    Operation div=(a,b)->b!=0?a/b:0;
    System.out.println("Add: "+add.compute(x,y));
    }
    
}
