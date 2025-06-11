import java.util.*;
public class Selsort 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("enter no.of ele");
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("enter ele :");
            a[i]=s.nextInt();
        }
        ss(a);
        System.out.print("sorted array :");
        for(int num:a)
        {
            System.out.print(num+" ");
        }
    }
    public static void ss(int[] a)
    {
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            int minindex=i;
            for(int j=i+1;j<n;j++)
            {
                if(a[j]<a[minindex])
                {
                    minindex=j;
                }
            }
            int temp=a[minindex];
            a[minindex]=a[i];
            a[i]=temp;
        }
    }
}
