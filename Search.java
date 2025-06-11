import java.util.*;
public class Search {
    
    public static void main(String[] args)
        {
            String[] bikes= {"HD","BMW","RE","DUCATI"};
            String search="HD";
            boolean found =false;
            for (String bike: bikes)
            {
                if (bike.equalsIgnoreCase(search))
                {
                    found=true;
                    break;
                }
            }
            if (found)
            {
                System.out.println(search+ "is found");
            }
            else
            {
                System.out.println(search+ "is not found");
            }
        }
    
    
}
