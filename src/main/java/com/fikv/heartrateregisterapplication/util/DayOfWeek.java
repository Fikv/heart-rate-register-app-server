package com.fikv.heartrateregisterapplication.util;

public enum DayOfWeek {
    
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;


    public static DayOfWeek getValueOf(int dayOfWeek) {

        return switch (dayOfWeek) {
            case 1 -> MONDAY;
            case 2 -> TUESDAY;
            case 3 -> WEDNESDAY;
            case 4 -> THURSDAY;
            case 5 -> FRIDAY;
            case 6 -> SATURDAY;
            case 7 -> SUNDAY;
            default -> null;
        };
    }


}
