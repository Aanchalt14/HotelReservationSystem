import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class HotelReservationTest {
    @Test
    public void givenhotel_WhenAdded_ShouldReturnTrue() {
        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.addHotel("Lakewood", 110);
        hotelReservation.addHotel("Bridgewood", 160);
        boolean result = hotelReservation.addHotel("Ridgewood", 220);
        Assert.assertTrue(result);
    }

    @Test
    public void givenDateRange_ShouldReturnCheapestHotel() {
        HotelReservation hotelReservation = new HotelReservation();
        LocalDate startDate = LocalDate.of(2020, Month.SEPTEMBER, 10);
        LocalDate endDate = LocalDate.of(2020, Month.SEPTEMBER, 11);
        hotelReservation.addHotel("Lakewood", 110);
        hotelReservation.addHotel("Bridgewood", 160);
        hotelReservation.addHotel("Ridgewood", 200);
        Hotel cheapestHotel = hotelReservation.getCheapestHotel(startDate, endDate);
        Assert.assertEquals("Lakewood", cheapestHotel.getName());
    }
}