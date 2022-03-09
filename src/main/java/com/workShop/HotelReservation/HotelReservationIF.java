package com.workShop.HotelReservation;

import java.time.LocalDate;
import java.util.ArrayList;

public interface HotelReservationIF {

     void addHotel(String hotelName,int rating, double weekDayRate,double weekendRate);
     int getHotelListSize();
     void printHotelList();
     ArrayList<Hotel> getHotelList();
     String getCheapestHotel(LocalDate startDate, LocalDate endDate);
}