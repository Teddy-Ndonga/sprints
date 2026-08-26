package NumberPrinter;

public class NumberPrinter {

    public void printNums(int a) {
        if (a < 0) {
            System.out.println("Negative numbers are not allowed");
        } else {
            for (int i = 0; i <= a; i++) {
                System.out.println(i);
            }
        }
    }
}
