import java.util.Scanner;
class Pet{
    String name;
    public void sound(){
        System.out.println("Animal sounds Only!!!!");
    }
}
class Dog extends Pet{
    @Override  //override sound() NoSuchMethodError
    public void sound(){
        System.out.println(name +" says : Woof");
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Dog myDog = new Dog();
        System.out.println("Enter dogs name: ");
        myDog.name=sc.nextLine();
        //calling the sound method from base class
        System.out.println("\n calling sound........");
        myDog.sound();
    }
    
}