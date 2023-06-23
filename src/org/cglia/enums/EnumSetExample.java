package org.cglia.enums;

import java.util.EnumSet;

public class EnumSetExample {
    enum DaysOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        EnumSet<DaysOfWeek> weekdays = EnumSet.range(DaysOfWeek.MONDAY, DaysOfWeek.FRIDAY);
        System.out.println("Weekdays: " + weekdays);

        EnumSet<DaysOfWeek> weekend = EnumSet.of( DaysOfWeek.SUNDAY, DaysOfWeek.SATURDAY);
        System.out.println("Weekend: " + weekend);

        EnumSet<DaysOfWeek> allDays = EnumSet.allOf(DaysOfWeek.class);
        System.out.println("All days: " + allDays);

        EnumSet<DaysOfWeek> noDays = EnumSet.noneOf(DaysOfWeek.class);
        System.out.println("No days: " + noDays);
    }
}