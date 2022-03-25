package training.day19;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.logging.Logger;

public class EnumPractice {

    public static void main(String[] args) {
        System.out.println(WeekDay.FRIDAY.getAbbr());

        ArrayList<WeekDay> allDaysList = new ArrayList<>();
        allDaysList.add(WeekDay.SUNDAY);
        allDaysList.add(WeekDay.MONDAY);
        allDaysList.add(WeekDay.TUESDAY);
        allDaysList.add(WeekDay.WEDNESDAY);
        allDaysList.add(WeekDay.THURSDAY);
        allDaysList.add(WeekDay.FRIDAY);
        allDaysList.add(WeekDay.SATURDAY);
        System.out.println(allDaysList);

        EnumSet<WeekDay> allDays = EnumSet.allOf(WeekDay.class);
        System.out.println(allDays);
        EnumSet<WeekDay> never = EnumSet.noneOf(WeekDay.class);
        System.out.println(never);
        EnumSet<WeekDay> workday = EnumSet.range(WeekDay.MONDAY, WeekDay.FRIDAY);
        System.out.println(workday);
        EnumSet<WeekDay> mwf = EnumSet.of(WeekDay.MONDAY, WeekDay.WEDNESDAY, WeekDay.FRIDAY);
        System.out.println(mwf);

        int weekDay = 0;

        Logger.getGlobal().info(String.valueOf(allDays));

        if(weekDay == WeekDay.SUNDAY.getAbbr()){

        }
    }
}
