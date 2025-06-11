//program to raise an exception if a negative number is considered as
//an input use simple throw without try-catch
import java.util.*;
public class except4 {
    public static void main(String[] args)
    {
    Scanner s=new Scanner(System.in);
    System.out.print("enter num");
    int n=s.nextInt();
    if(n<0)
    {
        throw new ArithmeticException("negative num are not allowed");
    }
    else
    {
        System.out.println("u have entered"+n);
    }
    s.close();

}
}
