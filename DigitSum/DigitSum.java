package DigitSum;

public class DigitSum {
    public static int sumOfDigits(int number) {
      int sum = 0;

      //Handle negative numbers by convertibg to absolute value
      number = Math.abs(number);

      //Process each digit until the number becomes zero
      while(number > 0){
        sum += number % 10; //Extract the last digit
        number /=10;  // Remove the last digit
      }
        return sum;
    }
}