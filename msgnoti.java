//real time application of getting notification 
//notification code by polymorphism
import java.util.*;
//base class
class Notification
{
    void notifyUser()
    {
        System.out.println("sending a general notification ");
    }
}
//email notification
class EmailNotification extends Notification
{
    void notifyUser()
    {
        System.out.println("sending email notification to gjp@example.com");
    }
}
//sms notification
class SMSNotification extends Notification
{
    void notifyUser()
    {
        System.out.println("sending SMS notification to +91 9951177487");
    }
}
//push notification
class PushNotification extends Notification
{
    void notifyUser()
    {
        System.out.println("sending push notification mobile app-Whatsapp");
    }
}
public class msgnoti {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        Notification notify;
        System.out.println("select notification type : ");
        System.out.println("1. Email");
        System.out.println("2. SMS");
        System.out.println("3. Whatsapp");
        System.out.println("Enter ur choice");
        int choice=s.nextInt();
        switch(choice)
        {
            case 1:
                notify=new EmailNotification();
                break;
            case 2:
                notify=new SMSNotification();
                break;
            case 3:
                notify=new PushNotification();
                break; 
            default:
                notify=new Notification();    
                    
        }
        notify.notifyUser();
        
    }
    
}
