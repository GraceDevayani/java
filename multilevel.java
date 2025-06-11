import java.util.*;
class Animal//base class
{
    String name;
    void details(Scanner s)
    {
        System.out.print("enter animal name");
        name=s.nextLine();
    }
    void showanimal()
    {
        System.out.println("animal "+name);
    }

}
class Mammal extends Animal
{
    String type;
    void mammaltype(Scanner s)
    {
        System.out.println("enter animal type");
        type=s.nextLine();
    }
    void showmammal()
    {
        System.out.println("mammaltype "+type);
    }
}
class Dog extends Mammal
{
    String breed;
    void breeddetails(Scanner s)
    {
         System.out.println("enter dog breed");
         breed=s.nextLine();
    }
    void showdog()
    {
        System.out.println(" dog breed"+breed);
    }
}
public class multilevel {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        Dog mydog=new Dog();
        mydog.details(s);
        mydog.mammaltype(s);
        mydog.breeddetails(s);
        System.out.print("-----------------------------------------------------------------------------------");
        mydog.showanimal();
        mydog.showmammal();
        mydog.showdog();
    }
    
}
