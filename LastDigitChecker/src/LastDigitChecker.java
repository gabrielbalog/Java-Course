public class LastDigitChecker {

    public static boolean hasSameLastDigit(int x, int y, int z) {
        if (!isValid(x) || !isValid(y) || !isValid(z)) {
            return false;
        }

        while (x > 0) {
            int yRef = y;
            int xDigit = x % 10;

            while (yRef > 0) {
                int zRef = z;
                int yDigit = y % 10;

                while (zRef > 0) {
                    int zDigit = z % 10;
                    if ((xDigit == zDigit) || (yDigit == zDigit)) {
                        return true;
                    }

                    zRef /= 10;
                }

                yRef /= 10;
            }

            x /= 10;
        }

        return false;
    }

    public static boolean isValid(int number) {
        if (number < 10 || number > 1000) {
            return false;
        }

        return true;
    }
}
