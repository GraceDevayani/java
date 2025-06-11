import java.util.*;
public class Palin 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("enter a");
        String a=s.nextLine();
        String cleaned=a.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        boolean isPalin=true;
        int left=0;
        int right=cleaned.length()-1;
        while(left<right)
        {
            if(cleaned.charAt(left)!=cleaned.charAt(right))
            {
                isPalin=false;
                break;
            }
            left++;
            right--;
        }
        if(isPalin)
        {
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
        s.close();

    }
}
