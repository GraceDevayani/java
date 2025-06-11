import java.util.Scanner;
class person{
    protected String name;
    protected void setName(String name){
        this.name=name;
    }
        protected void display(){
            System.out.println("Name: "+name);
    }
}
class Girl extends person{
    protected float height;
    protected void setHeight(float height){
        this.height=height;
    }
    public void displayDetails(){
        display();
        System.out.println("Height: "+height);
    }
}
public class mwe
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Girl g=new Girl();
        System.out.println("enter the name: ");
        String nameInput=sc.nextLine();
        g.setName(nameInput);
        System.out.println("enter height: ");
        Float height=sc.nextFloat();
        g.setHeight(height);
        System.out.println("\n.........PERSON DETAILS.........");
        g.displayDetails();
    }
}