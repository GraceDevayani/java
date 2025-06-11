class mathop
{
    int add(int a,int b)//overloading
    {
        return a+b;
    }
    double add(double a,double b)
    {
        return a+b;
    }
    int add(int a,int b,int c)
    {
        return a+b+c;
    }
}
public class polycom 
{
    public static void main(String[] args)
    {
        mathop m=new mathop();
        System.out.println("Addition: "+m.add(2,4));
        System.out.println("Addition: "+m.add(2.4,6.4));
        System.out.println("Addition: "+m.add(2,4,8));
    }
    
}

