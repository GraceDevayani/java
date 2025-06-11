// work shop on ticket booking(poly)
import java.util.*;
class booking{
    void bookTicket()
    {
        System.out.println("booking a general ticket-any mode");
    }
}
//train booking
class TrainBooking extends booking
{
    void bookTicket()
    {
         System.out.println("train ticket booked successfully...................");
         System.out.println("seat : L9 | coach: B5 | cost: ₹1023");
    }
}
//flight booking
class FlightBooking extends booking
{
    void bookTicket()
    {
        System.out.println("flight ticket booked successfully...................");
        System.out.println("seat: 16A | Service: Indigo | Fare: ₹6000");
    }
}
//cab booking
class CabBooking extends booking
{
    void bookTicket()
    {
        System.out.println("cab ride booked successfully...................");
        System.out.println("vehicle: MT-15 | Driver: Panda | Estimated Fare: ₹239");
    }
}
// cruise booking
class CruiseBooking extends booking
{
    void bookTicket()
    {
        System.out.println("cruise sail booked successfully...................");
        System.out.println("cabin: front view | Deck: 3 |  Fare: ₹23900");
    }
}
//bus booking
class BusBooking extends booking
{
    void bookTicket()
    {
        System.out.println("bus seat booked successfully...................");
        System.out.println("seat: 23 | Service: Monika Travels |  Number: 239");
    }
}

public class ticket
 {
    
    public static void main(String[] args)
        {
            Scanner s=new Scanner(System.in);
            booking Booking;
            System.out.println("enter ur mode of travel");
            System.out.println("1. train");
            System.out.println("2. bus");
            System.out.println("3. flight");
            System.out.println("4. cruise");
            System.out.println("5. cab");
            System.out.println("enter ur choice");
            int choice=s.nextInt();
            switch(choice)
            {
                case 1:
                    Booking=new TrainBooking();
                    break;
                case 2:
                    Booking=new BusBooking();
                    break;
                case 3:
                    Booking=new FlightBooking();
                    break;
                case 4:
                    Booking=new CabBooking();
                    break;
                case 5:
                    Booking=new CruiseBooking();
                    break; 
                default:
                    Booking=new booking();                   
            }
            System.out.println("\n processing ur booking.......................................");
            Booking.bookTicket();


        }
    
}    

