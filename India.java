public class India
{
    public static void main(String args[])
    {
        String word ="Panda";
        int len=word.length();
        for(int i=1;i<=len;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(word.charAt(j)+ " ");
            }
            System.out.println();
        }
        for(int i=len-1;i>=1;i--)
        {
             for(int j=0;j<i;j++)
            {
                System.out.print(word.charAt(j)+ " ");
            }
            System.out.println();
        }
        
        
    } 
}