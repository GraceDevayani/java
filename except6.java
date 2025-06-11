//nested try
//program to use try-catch
import java.util.*;
public class except6 {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        try
        {
            System.out.println("enter a number");
            int n=s.nextInt();//input mismatch string
            try
            {
                int result=100/n ;//mismatch ArithematicException
                System.out.print("result:"+result);
                try{
                    int[] a=new int[5];
                    System.out.println("accessing array ele"+a[10]);
                    //array index outofbound
                }
                catch(ArrayIndexOutOfBoundsException e)
                {
                    System.out.println("inner most catch:"+e.getMessage());
                }
             } catch(ArithmeticException e)
                {
                    System.out.println("middle catch:"+e.getMessage());
                }
            }
                catch(Exception e)
                {
                    System.out.println("outer catch: invalid num.please enter a num"+e.getMessage());
                }
                System.out.print("program ended");
                s.close();
            }
        }
    
    

