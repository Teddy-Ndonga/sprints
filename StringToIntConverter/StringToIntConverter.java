package StringToIntConverter;

import java.util.List;
import java.util.stream.Collectors;

public class StringToIntConverter {
    public List<Integer> convertStringListToIntList(List<String> input){
        return input.stream()

        //Conver each String to an Integer
         .map(Integer :: parseInt) //same as .map(s -> Integer.parseInt(s))

        //Collect the converted integers into a new List<Integer>.
        // .toList();
         .collect(Collectors.toList());
    }
    
}
