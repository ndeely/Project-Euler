/*
You are given the following information, but you may prefer to do some research for yourself.

1 Jan 1900 was a Monday.
Thirty days has September,
April, June and November.
All the rest have thirty-one,
Saving February alone,
Which has twenty-eight, rain or shine.
And on leap years, twenty-nine.
A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.

How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
*/

import java.util.stream.IntStream;

public class Problem19 {

    public Problem19() {
        int year = 1900;
        String month = "January";
        String day = "Monday";
        int sundayCount = 0;

        while (year <= 2000) {
            // add this months days to day
            int dayIndex = Shared.findIndex(Shared.days, day);
            int monthIndex = Shared.findIndex(Shared.months, month);
            int daysInMonth = getDaysInMonth(month, year);

            // add a month and find new day/month/year
            day = Shared.days[(dayIndex + daysInMonth) % 7];
            month = Shared.months[(monthIndex + 1) % 12];
            year += month.equals("January") ? 1 : 0;

            // if day = Sunday and year != 1900, sundaycount += 1
            sundayCount += (day == "Sunday" && year != 1900) ? 1 : 0;
        }

        // print result
        System.out.println("Sunday Count: " + sundayCount);
    }

    private int getDaysInMonth(String month, int year) {
        boolean leap = false;
        if (year % 400 == 0) {
            leap = true;
        } else if (year % 100 == 0) {
            leap = false;
        } else if (year % 4 == 0) {
            leap = true;
        }
        switch(month) {
            case "September":
            case "April":
            case "June":
            case "November":
                return 30;
            case "February":
                return leap ? 29 : 28;
            default:
                return 31;
        }

    }
}
