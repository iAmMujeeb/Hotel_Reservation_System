package com.bridgelabz.hotelmanagementsystem;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class HotelManagementSystemMain {

    public static void main(String[] args) {
        int weekdays = 0;
        int weekends = 0;
        List<Hotel> hotels = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Hotel lakewood = new Hotel();
        lakewood.hotelDetails("Lakewood", 3, 110, 80, 90, 80);
        hotels.add(lakewood);
        Hotel bridgewood = new Hotel();
        bridgewood.hotelDetails("Bridgewood", 4, 160, 110, 60, 50);
        hotels.add(bridgewood);
        Hotel ridgewood = new Hotel();
        bridgewood.hotelDetails("Ridgewood", 5, 220, 100, 150, 140);
        hotels.add(ridgewood);
        System.out.println(hotels);

        System.out.println("Enter the startdate  dd-MM-yyyy: ");
        LocalDate startDate = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println("Enter the enddate dd-MM-yyyy: ");
        LocalDate endDate = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println("Enter the customerTypes: ");
        System.out.println("1 - Regular Customer");
        System.out.println("2 - Reward Customer");
        int customerType = sc.nextInt();

        for (LocalDate date = startDate; date.isBefore(endDate); date = date.plusDays(1)) {
            switch (date.getDayOfWeek()) {
                case MONDAY:
                    weekdays++;
                case TUESDAY:
                    weekdays++;
                case WEDNESDAY:
                    weekdays++;
                case THURSDAY:
                    weekdays++;
                case FRIDAY:
                    weekdays++;
                case SATURDAY:
                    weekends++;
                case SUNDAY:
                    weekends++;
            }
        }

        if (customerType == 1) {
            lakewood.calculateRate(weekdays, weekends);
            bridgewood.calculateRate(weekdays, weekends);
            ridgewood.calculateRate(weekdays, weekends);
        }else{
            lakewood.calculateRate(weekdays, weekends);
            bridgewood.calculateRate(weekdays, weekends);
            ridgewood.calculateRate(weekdays, weekends);
        }

        hotels.stream().sorted();

    }
}
