import java.util.Scanner;
public class Array {
    public static void main(String[] args)
    {
        int[] num={ 77,6,33,98,99};
        int sum=0;
        for (int n:num)
        {
            sum=sum+n;
        }
        System.out.println("Sum=" +sum);
    }
}
