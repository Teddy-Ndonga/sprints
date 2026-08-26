package StreamPolice;

import java.util.List;
import java.util.stream.Collectors;

public class StreamPolice {
    public List<Integer> processNumbers(List<Integer> numbers){
        return numbers.stream()

         // Keep only non-negative numbers
         .filter(n -> n >= 0)

         // Remove numbers divisible by 5 but not by 10
         .filter(n -> !(n % 5 == 0 && n % 10 != 0))

         // Collect into a new List
         // .toList();
         .collect(Collectors.toList());

    }
    
}
