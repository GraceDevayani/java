import java.io.IOException;
import java.util.*;
public class except3 {
    static void readInput() throws IOException
    {
        Scanner s=new Scanner(System.in);
        System.out.print("enter data");
        String a=s.nextLine();
        System.out.print("u have entered"+a);

    }
    public static void main(String[] args)

    {
        try{
            readInput();        
        }
        catch(IOException e)
        {
            System.out.println("IO exception occured");
        }
    }
}
