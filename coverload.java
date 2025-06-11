import java.util.*;//constructor overload
class Stu
{
    String name;
    int roll;
    String grade;
    Stu()
    {
        name="unknown";
        roll=0;
        grade="Not assign";
    }
    Stu(String name,int roll)
    {
        this.name=name;
        this.roll=roll;
        grade="not assigned";
    }
    Stu(String name,int roll,String grade )
    {
        this.name=name;
        this.roll=roll;
        this.grade=grade;
    }
    public void display()
    {
        System.out.println("name"+name);
        System.out.println("roll"+roll); 
        System.out.println("grade"+grade);

    }

}
public class coverload {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        Stu s1=new Stu();
        s1.display();
        System.out.print("enter name");
        String name1=s.nextLine();
        System.out.print("enter roll");
        int roll1= s.nextInt();
        s.nextLine();
        System.out.print("enter grade");
        String grade1=s.nextLine();
         Stu s2 = new Stu(name1, roll1, grade1);
        s2.display();

        System.out.print("enter name: ");
        String name2 = s.nextLine();

        System.out.print("enter roll: ");
        int roll2 = s.nextInt();
        s.nextLine();  

        System.out.print("enter grade: ");
        String grade2 = s.nextLine();

        Stu s3 = new Stu(name2, roll2, grade2);
        s3.display(); 
        
        




    }

}
