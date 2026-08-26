# GreetingCard

## Greeting Card Maker

A Java exercise that creates a formatted, multi-line greeting card using string concatenation and newline characters.

## Requirements

Implement a `GreetingCard` class with a `createGreeting` method that:

- Takes a recipient's name as a `String`.
- Takes an occasion as a `String`.
- Returns a formatted multi-line greeting.
- Uses the following exact format:

```text
Happy [occasion]!
To: [recipientName]
Best wishes!

For example:

GreetingCard card = new GreetingCard();

System.out.println(
    card.createGreeting("Sirle", "Birthday")
);

Expected output:

Happy Birthday!
To: Sirle
Best wishes!

Implementation
public String createGreeting(String recipientName, String occasion) {
    return "Happy " + occasion + "!\nTo: " + recipientName + "\nBest wishes!";
}

The \n escape sequence creates a new line within the returned string.

Build and Run
Example Main.java:

import sprint.GreetingCard;

public class Main {

    public static void main(String[] args) {
        GreetingCard card = new GreetingCard();

        System.out.println(
            card.createGreeting("Sirle", "Birthday")
        );
    }
}

Compile:

javac -d build Main.java

Run:

java -cp ./build Main

Expected output:

Happy Birthday!
To: Sirle
Best wishes!

Concepts Practiced
Java classes
Methods
Method parameters
String concatenation
String formatting
Escape sequences
Newline character \n
Multi-line strings