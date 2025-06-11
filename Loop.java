import java.util.Scanner;
public class Loop {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("enter a");
        int a=s.nextInt();
        int i=1;
        while(i<=10)
        {
            int b=a*i;
            
            System.out.println(a +"x"+i+"="+b);
            i++;
        }

    }
    
}
