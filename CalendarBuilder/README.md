# Calendar Builder

A Java exercise that generates a formatted monthly calendar using the Java Date and Time API.

## Functional Requirements

Implement a `buildCalendar` method that:

- Accepts a month name and year.
- Generates a visual representation of the calendar.
- Displays the days from Monday to Sunday.
- Places empty days before the first day of the month using four spaces.
- Uses two leading spaces for single-digit days.
- Uses one leading space for double-digit days.
- Adds a single space between days.
- Does not add an extra space at the end of a week.
- Does not add an extra space after the final day of the month.
- Trims trailing whitespace from the final output.

## Implementation

The solution uses `Month`, `LocalDate`, and `StringBuilder` to construct the calendar.

```java
package sprint;

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

Usage
Create a Main.java file:

import sprint.CalendarBuilder;

public class Main {

    public static void main(String[] args) {
        System.out.println(CalendarBuilder.buildCalendar("May", 1993));
    }
}

Build and Run
From the sprints directory:

javac -d build Main.java CalendarBuilder/CalendarBuilder.java
java -cp build Main

Expected output:

MAY 1993
Mon Tue Wed Thu Fri Sat Sun
                      1   2
  3   4   5   6   7   8   9
 10  11  12  13  14  15  16
 17  18  19  20  21  22  23
 24  25  26  27  28  29  30
 31

How It Works
Month
The month name is converted into a Java Month enum:

Month month = Month.valueOf(monthName.toUpperCase());

For example:

May → MAY

LocalDate
The first day of the requested month is created:

LocalDate firstDay = LocalDate.of(year, month, 1);

This allows the program to determine which day of the week the month begins on.

Finding the Starting Day
int startDay = firstDay.getDayOfWeek().getValue();

Java represents Monday as 1 and Sunday as 7.

This value determines how many empty spaces need to appear before the first day.

Finding the Number of Days
int daysInMonth = month.length(firstDay.isLeapYear());

The leap-year check ensures that February has the correct number of days.

StringBuilder
StringBuilder is used to construct the calendar efficiently:

StringBuilder calendar = new StringBuilder();

Each day is appended to the result as the calendar is built.

Formatting Days
String.format("%3d", day)

ensures that:

Single-digit days have two leading spaces.
Double-digit days have one leading space.
Triple-digit values are not relevant because calendar days only go up to 31.
Key Concepts
LocalDate
Month
DayOfWeek
Leap years
StringBuilder
String.format()
String.trim()
Formatted text output
Useful Links
LocalDate
Month
DayOfWeek
StringBuilder