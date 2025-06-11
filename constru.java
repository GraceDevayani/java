import java.util.*;
class Stu
{
    String name;
    int  marks;
    Stu(String n,int m)
    {
        name=n;
        marks=m;
    }           

void display()
{
    System.out.print("name :"+name);
    System.out.print("marks :"+marks);

}
}
public class constru
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("enetr stu name");
        String name=s.nextLine();
        System.out.print("enter marks");
        int marks=s.nextInt();
        Stu student = new Stu(name, marks);
        student.display();
    }
}

