package BasicCalc;

public class BasicCalc {

    public int doOperation(int a, char op, int b) {

        switch (op) {
            case '+':
                return a + b;

            case '-':
                return a - b;

            case '/':
                if (b == 0) {
                    return 0;
                }
                return a / b;

            case '*':
                return a * b;

            case '%':
                if (b == 0) {
                    return 0;
                }
                return a % b;

            default:
                return 0;
        }
    }
}
