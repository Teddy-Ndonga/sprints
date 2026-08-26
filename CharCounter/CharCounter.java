package CharCounter;

public class CharCounter {
    public int countOccurrences(String input, char target) { // case-insensitive

      // Where input might be null or empty
      if(input == null || input.isEmpty()){
        return 0;
      }

      //Convert target to lowercase for uniform comparison
      char lowerTarget = Character.toLowerCase(target);
      
      int count = 0;

      for(int i = 0; i < input.length(); i++){
        if(Character.toLowerCase(input.charAt(i)) == lowerTarget){
          count ++;
        }
      }
      return count;

    }
}