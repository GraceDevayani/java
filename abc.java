import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class abc {
    public static void main(String[] args)
    {
        try(BufferedReader reader=new BufferedReader(new FileReader("abc.text")))
        {
            String line;
            System.out.println("Reading file content: ");
            while((line=reader.readLine()) !=null)
            {
                System.out.println(line);
            }

        }
        catch(IOException e)
        {
            System.out.println("Caught IOException: "+e.getMessage());
        }
    }
    
}
