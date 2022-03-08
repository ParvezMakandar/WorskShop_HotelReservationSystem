package com.workShop.HotelReservation;

import java.util.ArrayList;

public interface HotelReservationIF {

    void addHotel(String hotelName, double weekDayRate, double weekendRate);
    int getHotelListSize();
    void printHotelList();
    ArrayList<Hotel> getHotelList();
}