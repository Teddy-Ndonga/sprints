# Weekend Calculator

A Java exercise that counts the number of weekend days between two dates using `LocalDate` and `DayOfWeek`.

## Functional Requirements

Implement a `countWeekendDays` method that:

- Accepts two `LocalDate` objects: `startDate` and `endDate`.
- Counts all Saturdays and Sundays between the two dates.
- Returns the number of weekend days as a `long`.
- Includes both the start date and end date in the calculation.

## Implementation

The solution iterates through each date in the range and checks whether the day is a Saturday or Sunday.

```java
package sprint;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class WeekendCalculator {

    public long countWeekendDays(LocalDate startDate, LocalDate endDate) {

        long count = 0;
        LocalDate current = startDate;

        while (!current.isAfter(endDate)) {

            DayOfWeek day = current.getDayOfWeek();

            if (day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY) {
                count++;
            }

            current = current.plusDays(1);
        }

        return count;
    }
}

Usage
Create a Main.java file:

import sprint.WeekendCalculator;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 8, 1);
        LocalDate endDate = LocalDate.of(2024, 8, 31);

        WeekendCalculator calculator = new WeekendCalculator();

        long weekendDayCount =
                calculator.countWeekendDays(startDate, endDate);

        System.out.println(weekendDayCount);
    }
}

Build and Run
From the sprints directory:

javac -d build Main.java WeekendCalculator/WeekendCalculator.java
java -cp build Main

Expected output:

9

Key Concepts
LocalDate
LocalDate represents a date without a time or timezone.

LocalDate date = LocalDate.of(2024, 8, 1);

DayOfWeek
DayOfWeek provides the day of the week for a LocalDate.

DayOfWeek day = date.getDayOfWeek();

It can then be compared against:

DayOfWeek.SATURDAY
DayOfWeek.SUNDAY

Iterating Through Dates
plusDays(1) moves the current date forward by one day:

current = current.plusDays(1);

The loop continues until the current date passes the end date.

Useful Links
LocalDate
DayOfWeek