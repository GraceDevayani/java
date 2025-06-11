import java.util.*;//lambda built-in methods
public class funinter 
{
    public static void main(String[] args)
    Scanner s=new Scanner(System.in);
    System.out.print("enter n");
    int n=s.nextInt();
    Function<Integer, integer>square=(n)->n*n;
    Predicate<Integer> isEven=(n)->n%2==0;
    Consumer<Integer> display=(n)->System.out.println("result"+n);
    if (isEven.test(n))
    {
        int result;
        square.apply(number);
        display.accept(result);
    }
    else
    {
        System.out.println("enterva even number");
    }
    s.close();
}
