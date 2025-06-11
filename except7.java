
import java.util.*;
public class except7 {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        try
        {
            System.out.println("Enter a number as string");
            String input=sc.nextLine();
            int number =Integer.parseInt(input);//numberformat exception
            System.out.println("Parsed number:"+number);
            int[] values={10,20,30,40};
            System.out.println("Enter an index to access for 0-3:");
            int index=sc.nextInt();
            //inputmismatchexception
            System.out.println("value at index"+index+" "+values[index]);
            
        }
        catch(NumberFormatException e)
        {
            System.out.print("caught Numberformatexception: input is not a valid");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("arrayindexoutofbounds");
        }
        catch(InputMismatchException e)
        {
            System.out.println("inputmismatch");
        }
        catch(Exception e)
        {
            System.out.println("inputmismatch");
        }
        System.out.print("ended");
        sc.close();
    }
}

