package EmailDomainExtractor;

import java.util.List;
import java.util.stream.Collectors;

public class EmailDomainExtractor {
    public List<String> extractDomains (List<String> emails){
        return emails.stream()

        .filter(email -> {
            int firstAt = email.indexOf('@');
            int lastAt = email.lastIndexOf('@');

            // Valid if exactly one @, something before it,
            // and something after it.
            return firstAt > 0   //There is text before the @ (firstAt > 0).
                && firstAt == lastAt    //exactly one @ (firstAt == lastAt)
                && firstAt < email.length() - 1;  //There is text after the @ (firstAt < email.length() - 1).
        })
        //Extract the domain
        .map(email -> email.substring(email.indexOf('@') + 1).toLowerCase())

        //Remove duplicates
        .distinct()

        //.toList();
        .collect(Collectors.toList());
    }
}
