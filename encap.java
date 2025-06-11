import java.util.*;
public class encap {
    //encapsulate student class
    static class Student
    {
        private String name;
        private int age;
        private double grade;
        //constructor privately for the static class
        public Student(String name,int age,double grade)
        {
            this.name=name;
            this.age=age;
            this.grade=grade;

        }
        public String getName()// getters
        {
            return name;
        }
        public int getAge()
        {
            return age;
        }
        public double getGrade()
        {
            return grade;
        }
        //setter
        public void setName(String name)
        {
            this.name=name;
        }
        public void setAge(int age)
        {
            if(age>19)
            {
                this.age=age;
            }
            else{
                System.out.println(" not valid");
            }
        }
        public void setGrade(double grade)
        {
            System.out.println("-----------------Set Grade-----------------");
            if(grade>=0 && grade<=100)
            {
                this.grade=grade;
            }
            else{
                System.out.println("Invalid grade");
            }
        }
        public void displayDetails()
        {
            System.out.println("-----------------Display Details-----------------");
            System.out.println("stu details");
            System.out.println("name: "+name);
            System.out.println("age "+age);
            System.out.println("grade "+grade);
        }
    }
        public static void main(String[] args)
        {
            System.out.println("-----------------Enter Details-----------------");
            Scanner s=new Scanner(System.in);
            System.out.println("enter stu name");
            String name=s.nextLine();
            System.out.println("enter age");
            int age=s.nextInt();
            System.out.println("enter stu grade");
            double grade=s.nextDouble();
            Student student=new Student(name,age,grade);
            System.out.println("----------------------------------------------");
            student.displayDetails();
            
            System.out.println("---------------Updating Student Data---------------");
            System.out.println("enter new name");
            //clear the buffer before entering the name
            s.nextLine();
            String newName=s.nextLine();
            student.setName(newName);
            System.out.println("enter age");
            int newAge=s.nextInt();
            student.setAge(newAge);
            System.out.println("enter grade");
            double newGrade=s.nextDouble();
            student.setGrade(newGrade);

            student.displayDetails();
            s.close();


        }
 
    
    
}
