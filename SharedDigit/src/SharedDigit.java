public class SharedDigit {
    public static boolean hasSharedDigit(int x, int y) {
        if ((x < 10 || x > 99) || (y < 10 || y > 99)) {
            return false;
        }

        while (x > 0) {
            int xDigit = x % 10;
            int yRef = y;
            while (yRef > 0) {
                int yDigit = yRef % 10;
                if (xDigit == yDigit) {
                    return true;
                }

                yRef /= 10;
            }

            x /= 10;
        }

        return false;
    }
}
