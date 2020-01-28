public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if ((first < 10) || (second < 10)) {
            return -1;
        }

        int divisor = 1;
        int higher = first;
        if (first < second) {
            higher = second;
        }

        for (int i = higher; i >= 1; i--) {
            if ((first % i == 0) && (second % i == 0)) {
                divisor = i;
                break;
            }
        }


        return divisor;
    }
}
