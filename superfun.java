import java.util.*;
class Person//super class
{
    String name;
    void setName(String name)
    {
        this.name=name;
    } 
    void display()
    {
        System.out.print("name from person superclass"+name);
    }

}
//class
class Student extends Person
{
    int rollno;
    //super(destination(att))
    void  setDetails(String name,int rollno)
    {
        super.setName(name);//calling super class method
        this.rollno=rollno;
    }
    void display()
    {
        super.display();
        System.out.println("\nroll num from stu class"+rollno);
    }
}
public class superfun {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter stu name");
        String name=s.nextLine();
        System.out.println("enter rollno");
        int rollno=s.nextInt();
        Student s1=new Student();
        s1.setDetails(name,rollno);
        s1.display();
    }

    
}
