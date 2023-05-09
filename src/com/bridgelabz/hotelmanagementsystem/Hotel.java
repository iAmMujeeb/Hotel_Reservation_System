package com.bridgelabz.hotelmanagementsystem;

public class Hotel {

    String hotelName;
    int rating;
    int weekdayRateReg;
    int weekdayRateRew;
    int weekendRateReg;
    int weekendRateRew;

    public void hotelDetails(String hotelName, int rating, int weekdayRateReg, int weekdayRateRew, int weekendRateReg, int weekendRateRew) {
        this.hotelName = hotelName;
        this.rating = rating;
        this.weekdayRateReg = weekdayRateReg;
        this.weekdayRateRew = weekendRateRew;
        this.weekendRateReg = weekendRateReg;
        this.weekendRateRew = weekendRateRew;
    }

    public void calculateRate(int weekdays, int weekends) {
        int temp1 = 0;
        int temp2 = 0;
        int temp3 = 0;
        int temp4 = 0;

        temp1 = weekdays * weekdayRateReg;
        temp2 = weekends * weekendRateReg;
        temp3 = weekdays * weekdayRateRew;
        temp4 = weekends * weekendRateRew;

        int totalRateReg = temp1 + temp2;
        int totalRateRew = temp3 + temp4;
    }


}
