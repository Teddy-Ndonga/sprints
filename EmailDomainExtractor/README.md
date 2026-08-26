# Email Domain Extractor

## Functional Requirements

Implement a method called `extractDomains` on the
`EmailDomainExtractor` class.

The method takes a `List<String>` containing email addresses and
returns a list of unique, lowercase email domains.

The method should:

1. Filter out invalid email addresses.
2. Ensure each valid email contains exactly one `@` symbol.
3. Ensure there is text before and after the `@` symbol.
4. Extract the domain from each valid email.
5. Convert each domain to lowercase.
6. Remove duplicate domains.
7. Return an empty list if no valid email addresses remain.

The solution must use the Java Stream methods `filter`, `map`, and
`distinct`.

Domain validity does not need to be checked beyond the requirements
above.

## Expected Code Snippet

### EmailDomainExtractor.java

```java
package sprint;

import java.util.List;

public class EmailDomainExtractor {
    public List<String> extractDomains(List<String> emails) {
        // solution code here
    }
}

Usage
Main.java
import sprint.EmailDomainExtractor;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        EmailDomainExtractor extractor = new EmailDomainExtractor();

        List<String> emails = Arrays.asList(
            "USER1@EXAMPLE.COM",
            "user2@Example.com",
            "user1@EXAMPLE.COM",
            "user3@SAMPLE.ORG",
            "INVALIDEMAIL@",
            "user4@SAMPLE.ORG"
        );

        List<String> domains = extractor.extractDomains(emails);

        domains.forEach(System.out::println);
    }
}

Build and Run
From the EmailDomainExtractor directory:

javac -d build Main.java
java -cp ./build Main

Expected output:

example.com
sample.org

How It Works
The solution uses a Java Stream pipeline with filter, map, and
distinct.

1. Filter invalid emails
.filter(email -> {
    int firstAt = email.indexOf('@');
    int lastAt = email.lastIndexOf('@');

    return firstAt > 0
        && firstAt == lastAt
        && firstAt < email.length() - 1;
})

The email is considered valid when:

There is text before the @.
There is exactly one @.
There is text after the @.
For example:

USER1@EXAMPLE.COM  → valid
INVALIDEMAIL@     → invalid
user@example.com@ → invalid
@example.com      → invalid

2. Extract and lowercase the domain
.map(email -> email.substring(email.indexOf('@') + 1).toLowerCase())

This removes everything before and including the @ symbol.

For example:

USER1@EXAMPLE.COM → example.com
user3@SAMPLE.ORG → sample.org

3. Remove duplicates
.distinct()

Removes duplicate domains after they have been converted to lowercase.

For example:

EXAMPLE.COM
Example.com
example.com

becomes:

example.com

Helpful Tips
indexOf('@') returns the position of the first @ symbol.

lastIndexOf('@') returns the position of the last @ symbol.

Comparing the two allows you to determine whether an email contains
exactly one @:

firstAt == lastAt

The substring() method can then be used to extract the domain.

distinct() is useful when a stream needs to remove duplicate values.

Useful Links
Java Streams
Stream filter()
Stream map()
Stream distinct()