# Day Checker

## Functional Requirements

Implement a `checkDayType` method on a `DayChecker` class that accepts a
`LocalDate` and determines the type of day using a traditional Java
`switch` statement.

The method should return:

- `"Weekend"` if the date is Saturday or Sunday.
- `"Hump Day!"` if the date is Wednesday.
- `"Weekday"` for any other day.

## Implementation

```java
package sprint;

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

Usage
Create a Main.java file in the sprints directory:

import sprint.DayChecker;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        LocalDate weekdayDate = LocalDate.of(2024, 8, 26);
        LocalDate weekendDate = LocalDate.of(2024, 8, 31);
        LocalDate wednesdayDate = LocalDate.of(2024, 8, 28);

        System.out.println(DayChecker.checkDayType(weekdayDate));
        System.out.println(DayChecker.checkDayType(weekendDate));
        System.out.println(DayChecker.checkDayType(wednesdayDate));
    }
}

Build and Run
From the sprints directory:

javac -d build Main.java DayChecker/DayChecker.java

Run:

java -cp build Main

Expected output:

Weekday
Weekend
Hump Day!

How It Works
LocalDate represents a date without a time.

The day of the week can be obtained using:

DayOfWeek day = date.getDayOfWeek();

getDayOfWeek() returns a DayOfWeek enum value such as:

MONDAY
TUESDAY
WEDNESDAY
THURSDAY
FRIDAY
SATURDAY
SUNDAY

The traditional switch statement is then used to determine the
appropriate result.

Weekend
Saturday and Sunday share the same result:

case SATURDAY:
case SUNDAY:
    return "Weekend";

Wednesday
Wednesday has its own case:

case WEDNESDAY:
    return "Hump Day!";

Other Days
All remaining days are handled by default:

default:
    return "Weekday";

Key Concepts
LocalDate
LocalDate is part of the Java Date and Time API and represents a date
such as 2024-08-28.

DayOfWeek
DayOfWeek is an enum representing the seven days of the week.

Traditional Switch
This exercise specifically uses the traditional Java switch statement
rather than the newer switch expression syntax.

Helpful Tips
Use getDayOfWeek() to extract the day from a LocalDate.
DayOfWeek is an enum, so its constants can be used directly in a
switch.
Multiple cases can share the same implementation.
The default case handles all remaining days.
Useful Links
LocalDate
DayOfWeek
Java switch Statement