# Combinations

A Java exercise for practicing recursion, `ArrayList`, and generating combinations of ascending digits.

## Functional Requirements

Implement a method `combN` for the `Combinations` class.

The method accepts an integer `n` and should:

- Generate all possible combinations of ascending digits.
- Each combination must contain exactly `n` digits.
- Digits within each combination must be in ascending order.
- Return the combinations as a `List<String>`.
- Return an empty list when `n` is less than or equal to `0`.

## Implementation

### `Combinations.java`

```java
package sprint;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

    public List<String> combN(int n) {

        List<String> combinations = new ArrayList<>();

        // If n is invalid return empty list
        if (n <= 0) {
            return combinations;
        }

        generateCombinations(
                combinations,
                "",
                0,
                n
        );

        return combinations;
    }

    private void generateCombinations(
            List<String> combinations,
            String current,
            int start,
            int n
    ) {

        // Base case: combination has reached required length
        if (current.length() == n) {
            combinations.add(current);
            return;
        }

        // Try digits from start to 9
        for (int digit = start; digit <= 9; digit++) {

            generateCombinations(
                    combinations,
                    current + digit,
                    digit + 1,
                    n
            );
        }
    }
}

Usage
The following Main.java can be used to test the Combinations class.

Main.java
import sprint.Combinations;

public class Main {

    public static void main(String[] args) {
        Combinations comb = new Combinations();

        System.out.println(comb.combN(3));
    }
}

Build and Run
From the directory containing Main.java and the sprint package:

Compile
javac -d build Main.java Combinations.java

Run
java -cp ./build Main

Expected Output
[012, 013, 014, 015, 016, 017, 018, ..., 679, 689, 789]

The complete result contains every combination of three ascending digits.

For example:

012
013
014
...
678
679
689
789

How It Works
The method uses recursion to build each combination one digit at a time.

For example, when n is 3, the process can begin with:

0

Then the next digit must be greater than 0:

01
02
03
...

After selecting 01, the next digit must be greater than 1:

012
013
014
...

Once the combination reaches the required length, it is added to the result list.

Base Case
The recursion stops when the current combination reaches the requested length:

if (current.length() == n) {
    combinations.add(current);
    return;
}

This is the base case of the recursive method.

Maintaining Ascending Order
The start parameter controls which digits are available for the next position.

After selecting a digit, the next recursive call starts at:

digit + 1

For example, after selecting 3, the next digit can only be 4 or greater.

This prevents combinations such as:

321

and allows only ascending combinations such as:

123

Invalid Input
If n is less than or equal to 0, the method returns an empty list:

if (n <= 0) {
    return combinations;
}

Helpful Tips
Recursion
Recursion is a technique where a method calls itself to solve smaller parts of a problem.

A recursive method normally needs:

A base case that stops the recursion.
A recursive case that moves the problem closer to the base case.
ArrayList
ArrayList is used to store the generated combinations:

List<String> combinations = new ArrayList<>();

A new combination is added using:

combinations.add(current);

Useful Links
Recursion
ArrayList
