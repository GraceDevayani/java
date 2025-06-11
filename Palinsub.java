import java.util.*;
public class Palinsub
 {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("enter a");
        String a=s.nextLine();
        int count=0;
        int len=a.length();
        System.out.print("Palindrome sub strings\n");
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<=len;j++)
            {
                String sub=a.substring(i,j);
                if(isPalindrome(sub))
                {
                    System.out.println(sub);
                    count++;
                }
            }
        }
        System.out.println("total palin sub strings:"+count);
        s.close();
    }
    public static boolean isPalindrome(String a)
    {
        int left=0;
        int right=a.length()-1;
        while(left<right)
        {
            if(a.charAt(left)!=a.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
