package com.bridgelabz.HotelManagementSystem;

public class Hotel {
    String hotelName;
    int rating;
    double weekdayRegularRate;
    double weekdayRewardRate;
    double weekendRegularRate;
    double weekendRewardRate;

    public Hotel() {
    }

    public Hotel(String hotelName, int rating, double weekdayRegularRate, double weekdayRewardRate, double weekendRegularRate, double weekendRewardRate) {
        this.hotelName = hotelName;
        this.rating = rating;
        this.weekdayRegularRate = weekdayRegularRate;
        this.weekdayRewardRate = weekdayRewardRate;
        this.weekendRegularRate = weekendRegularRate;
        this.weekendRewardRate = weekendRewardRate;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public double getWeekdayRegularRate() {
        return weekdayRegularRate;
    }

    public void setWeekdayRegularRate(double weekdayRegularRate) {
        this.weekdayRegularRate = weekdayRegularRate;
    }

    public double getWeekdayRewardRate() {
        return weekdayRewardRate;
    }

    public void setWeekdayRewardRate(double weekdayRewardRate) {
        this.weekdayRewardRate = weekdayRewardRate;
    }

    public double getWeekendRegularRate() {
        return weekendRegularRate;
    }

    public void setWeekendRegularRate(double weekendRegularRate) {
        this.weekendRegularRate = weekendRegularRate;
    }

    public double getWeekendRewardRate() {
        return weekendRewardRate;
    }

    public void setWeekendRewardRate(double weekendRewardRate) {
        this.weekendRewardRate = weekendRewardRate;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", rating=" + rating +
                ", weekdayRegularRate=" + weekdayRegularRate +
                ", weekdayRewardRate=" + weekdayRewardRate +
                ", weekendRegularRate=" + weekendRegularRate +
                ", weekendRewardRate=" + weekendRewardRate +
                '}';
    }
}
