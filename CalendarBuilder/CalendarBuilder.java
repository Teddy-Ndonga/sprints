package CalendarBuilder;

import java.time.LocalDate;
import java.time.Month;

public class CalendarBuilder {

    public static String buildCalendar(String monthName, int year) {

        Month month = Month.valueOf(monthName.toUpperCase());

        LocalDate firstDay = LocalDate.of(year, month, 1);

        int startDay = firstDay.getDayOfWeek().getValue();

        int daysInMonth = month.length(firstDay.isLeapYear());

        StringBuilder calendar = new StringBuilder();

        calendar.append(monthName.toUpperCase())
                .append(" ")
                .append(year)
                .append("\n");

        calendar.append("Mon Tue Wed Thu Fri Sat Sun\n");


        // Empty days before month starts
        for (int i = 1; i < startDay; i++) {
            calendar.append("    ");
        }


        int currentDayOfWeek = startDay;

        for (int day = 1; day <= daysInMonth; day++) {

            calendar.append(String.format("%3d", day));

            if (currentDayOfWeek != 7 && day != daysInMonth) {
                calendar.append(" ");
            }


            if (currentDayOfWeek == 7) {
                calendar.append("\n");
                currentDayOfWeek = 1;
            } else {
                currentDayOfWeek++;
            }
        }

        return calendar.toString().trim();
    }
}