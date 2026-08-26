package PowerCalculator;

public class PowerCalculator {

    public int calculatePower(int base, int exponent) {

        if (exponent == 0) {
            return 1;
        }

        if (exponent < 0) {
            if (base == 1) {
                return 1;
            }

            if (base == -1) {
                return (exponent % 2 == 0) ? 1 : -1;
            }

            return 0;
        }

        int result = 1;

        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

        return result;
    }
}
