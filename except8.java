//console exceptions
import java.util.*;
public class except8 {
    public static void main(String[] args)
    {
        try(Scanner s=new Scanner(System.in))
        {
            System.out.print("enter ur name");
            String name=s.nextLine();
            System.out.println("hello," +name+"!");
        }
    }

    
}
