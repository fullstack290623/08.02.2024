package com.company;

public class DaysOfWeek {

    final static String red_light = "RED";

    public enum DayOfWeek {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY;
    }

    public static void main(String[] args) {

        //("red".equals(red_light))
        //int daysOfWeek = 0;
        // 1 -- sunday

        var r = 5.5;
        DayOfWeek day = DayOfWeek.MONDAY;
        for (var _day: DayOfWeek.values()) {
            System.out.println(_day.toString());
        }
        DayOfWeek sunday2 = DayOfWeek.SUNDAY;
        String user = "TUESDAY";
        DayOfWeek user_day;
        switch (user) {
            case "SUNDAY": user_day = DayOfWeek.SUNDAY;
                break;
            case "MONDAY": user_day = DayOfWeek.MONDAY;
                break;
            // .....
        }
        DayOfWeek sunday1 = Enum.valueOf(DayOfWeek.class, "SUNDAY");


        System.out.println("=====");
        System.out.println(sunday2);
    }
}

