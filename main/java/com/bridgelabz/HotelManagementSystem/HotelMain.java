package com.bridgelabz.HotelManagementSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HotelMain {
    public static ArrayList<Hotel> hotels = new ArrayList<>();

    public static boolean isWeekend(LocalDate localDate){
        String dayOfWeek = localDate.getDayOfWeek().toString();
        return "SATURDAY".equalsIgnoreCase(dayOfWeek) || "SUNDAY".equalsIgnoreCase(dayOfWeek);
    }

    public static void main(String[] args) {
        Hotel hotel1 = new Hotel("Lakewood",3,110.0,80.0,90.0,80.0);
        hotels.add(hotel1);

        Hotel hotel2 = new Hotel("Bridgewood",4,160.0,110.0,60.0,50.0);
        hotels.add(hotel2);

        Hotel hotel3 = new Hotel("Ridgewood",5,220.0,100.0,150.0,40);
        hotels.add(hotel3);

        System.out.println(hotels);

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the number of days you want to book the hotel: ");
        int numOfDays = in.nextInt();
        System.out.println("Please confirm the dates you want to book the hotel: ");
        System.out.println("From: ");
        System.out.print("Enter date: ");
        int date = in.nextInt();
        System.out.print("Enter month: ");
        int month = in.nextInt();
        System.out.print("Enter year: ");
        int year = in.nextInt();
        LocalDate fromDate = LocalDate.of(year, month, date);

        int weekendCount = 0;
        int weekdayCount = 0;
        for (int i=0 ; i<=numOfDays ; i++){
            if(isWeekend(fromDate))
                weekendCount++;
            else
                weekdayCount++;
            fromDate = LocalDate.of(year,month,date++);
        }

        final int noOfWeekend = weekendCount;
        final int noOfWeekday = weekdayCount;

        System.out.println("Please choose the type of Membership: ");
        System.out.println("For Regular Customer - PRESS 1");
        System.out.println("For Rewards Customer - PRESS 2");
        int choice = in.nextInt();
        List<Hotel> cheapestHotel;

        System.out.println("Cheapest Hotel Details: ");
        switch (choice){
            case 1:
                cheapestHotel = hotels.stream().min(Comparator.comparing(hotel -> {
                    double weekdayPrice = hotel.getWeekdayRegularRate() * noOfWeekday;
                    double weekendPrice = hotel.getWeekendRegularRate() * noOfWeekend;
                    System.out.println(hotel.getHotelName()+ " - " +(weekdayPrice+weekendPrice));
                    return weekendPrice + weekdayPrice;
                })).stream().collect(Collectors.toList());
                System.out.println(cheapestHotel);
                break;
            case 2:
                cheapestHotel = hotels.stream().min(Comparator.comparing(hotel -> {
                    double weekdayPrice = hotel.getWeekdayRewardRate() * noOfWeekday;
                    double weekendPrice = hotel.getWeekendRewardRate() * noOfWeekend;
                    System.out.println(hotel.getHotelName()+ " - " +(weekdayPrice+weekendPrice));
                    return weekendPrice + weekdayPrice;
                })).stream().collect(Collectors.toList());
                System.out.println(cheapestHotel);
                break;
        }
    }
}
