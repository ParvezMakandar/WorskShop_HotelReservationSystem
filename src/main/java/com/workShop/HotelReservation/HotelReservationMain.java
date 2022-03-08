package com.workShop.HotelReservation;

public class HotelReservationMain {
    public static void main(String[] args) {

        System.out.println(" Welcome To Hotel Reservation");
        HotelReservationIF hotelReservation = new HotelReservation();
        hotelReservation.addHotel("Lakewood",  110,90);
        hotelReservation.addHotel("Bridgewood", 150,50);
        hotelReservation.addHotel("Ridgewood", 220,150);
        hotelReservation.printHotelList();
    }
}