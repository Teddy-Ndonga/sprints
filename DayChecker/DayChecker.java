package DayChecker;

import java.time.LocalDate;
import java.time.DayOfWeek;

public class DayChecker {

    public static String checkDayType(LocalDate date) {

        DayOfWeek day = date.getDayOfWeek();

        switch (day) {
            case SATURDAY:
            case SUNDAY:
                return "Weekend";

            case WEDNESDAY:
                return "Hump Day!";

            default:
                return "Weekday";
        }
    }
}