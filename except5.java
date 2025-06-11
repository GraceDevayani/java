import java.util.*;
public class except5 {
    static void validateScore(int score)
    {
        if(score<0||score>100)
        {
            throw new IllegalArgumentException("score is above range");
        }
        else
        {
            System.out.print("valid score "+score);
        }
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        try
        {
            System.out.println("enter score");
            int score=s.nextInt();
            validateScore(score);
        }
        catch(IllegalArgumentException e)
        {
            System.out.print("exception caught:"+e.getMessage());
        }
        finally{
            s.close();
        }
    }

    
}
