import java.util.*;
public class Anagram {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("enter s1");
        String s1=s.nextLine();
        System.out.print("enter s2");
        String s2=s.nextLine();
        s1=s1.replaceAll("\\s", "").toLowerCase();//converting all alphabets to lower removes spaces
        s2=s2.replaceAll("\\s", "").toLowerCase();
        if(s1.length() != s2.length())
        {
            System.out.print("Not anagram to eachother");
        }
        else
        {
            char[] arr1=s1.toCharArray();//converting string into array
            char[] arr2=s2.toCharArray();
            Arrays.sort(arr1);//sorting the array
            Arrays.sort(arr2);
            boolean isAnagram=Arrays.equals(arr1, arr2);
            if(isAnagram)
            {
                System.out.print("the strings are anagrams");
            }
            else
            {
                System.out.print("the strings are not anagrams");
            }
         }
         s.close();
    }
    
}
