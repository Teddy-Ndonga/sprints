package WordLengthAnalyzer;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordLengthAnalyzer {
    public Map<Integer, Integer>  analyzeWordLengths (List<String> words){
        return words.stream()
            //Group by word length
            .collect(Collectors.groupingBy(
                String::length,

                //Convert Long to Integer 
                Collectors.collectingAndThen(
                    Collectors.counting(), 
                    Long::intValue
                )

            ));

    }
    
}


//Group by word length - Collectors.groupingBy(String::length)

//Count each group - Collectors.counting()


