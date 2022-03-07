package com.workShop.HotelReservation;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class HotelReservationTest {
    @Test
    public void givenHotelDetails_WhenSizeMatches_ShouldReturnTrue()
    {
        HotelReservationIF hotelReservation = new HotelReservation();
        hotelReservation.addHotel();
        int hotelListSize = hotelReservation.getHotelListSize();
        assertEquals(3, hotelListSize);
    }
}