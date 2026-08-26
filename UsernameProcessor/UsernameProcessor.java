package UsernameProcessor;

import java.util.List;

public class UsernameProcessor {
    public String findFirstUsername(List<String> usernames){
        //Create a stream from the list.
        return usernames.stream()

        //Return an Optional<String> containing the first element if it exists.
         .findFirst()

        //Otherwise, returns "Anonymous".
         .orElse("Anonymous");
    }
}
