import java.util.*;//throw
public class except2 {
    static void checkAge(int age)
    {
        if(age<22)
        {
            throw new ArithmeticException("access denied");
        }
        else
        {
            System.out.print("access granted");
        }
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("enter age");
        int age=s.nextInt();
        try{
            checkAge(age);
        }
        catch(ArithmeticException e)
        {
            System.out.print("exception: "+e.getMessage());
        }
        finally{
            s.close();
        }
    }
    
}
