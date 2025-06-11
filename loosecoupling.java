import java.util.*;
//using abstraction interface
interface Printer
{
    void print(String Content);
}
//a concrete class for implementation
class LaserPrinter implements Printer{
    public void print(String content)
    {
        System.out.println("Laser printer output"+content);
    }
}
//another concrete class for implementation
class InkjetPrinter implements Printer{
    public void print(String content)
    {
        System.out.println("inkjet printer output"+content);
    }
}
//manager using interface(abstract)
class PrintManager
{
    public PrintManager(printer printer)
    {
        printer.print(content);
    }
}

public class loosecoupling {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("enter a document");
        String d=s.nextLine();
        System.out.print("enter a document");
        String 
    }
    
}
