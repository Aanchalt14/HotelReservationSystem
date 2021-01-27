import java.util.ArrayList;

class Hotel{
    private String name;
    private int RatesForWeekDays;

    public Hotel(String name, int ratesForWeekDays) {
        this.name = name;
        RatesForWeekDays = ratesForWeekDays;
    }
}
public class HotelReservation {
    ArrayList<Hotel> hotel = new ArrayList();
    public static void main(String[] args) {
        System.out.println("Welcome to hotel reservation system");
    }
    public boolean addHotel(String name , int ratesForWeekDays){
        if(hotel.add(new Hotel(name,ratesForWeekDays)))
        return true;
        return false;
    }
}
