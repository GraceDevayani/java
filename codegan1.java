import java.util.*;
interface Printable
{
    void display();
}
class Book implements Printable
{
    String title;
    String author;
    Book(String title,String author)
    {
        this.title=title;
        this.author=author;
    }
   public void display()
    {
        System.out.print("Book: "+title+","+"Author: "+author);
    }
}
public class codegan1 {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String title=s.next();
        String author=s.next();
        Printable p=new Book(title, author);
        p.display();
    }
    
}
