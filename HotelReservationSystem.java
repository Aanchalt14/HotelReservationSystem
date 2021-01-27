import java.util.ArrayList;
public class HotelReservationSystem {
    Array<Hotel> hotels = new ArrayList();
    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation program");
    }

    public boolean addHotel(String name , int rate) {
        if (hotels.add(new Hotel(name, rate)))
            return true;
        return false;
    }

    public Hotel getCheapestHotel(LocalDate startDate, LocalDate endDate) {
        long between = ChronoUnit.DAYS.between(startDate, endDate);
        Hotel cheapest = null;
        double cheapRate = 0.0;
        for (Hotel hotel : hotels) {
            double hotelRate = hotel.getRatesForWeekDays() * between;
            if (cheapRate == 0) {

                cheapRate = hotelRate;
            }
            if (hotelRate <= cheapRate) {
                cheapest = hotel;
                cheapRate = hotelRate;
            }
        }
        return cheapest;
    }

}
