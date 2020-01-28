public class LargestPrimeFunc {
    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }

        int largestNumber = 0;

        for (int x = 3; x < number; x++) {
            if (isPrime(x)) {
                for (int y = 3; (y * x) <= number; y++) {
                    if (isPrime(y)) {
                        for (int z = 3; (y * x * z) <= number; z++) {
                            if (isPrime(z)) {
                                if ((x * y * z) == number) {
                                    largestNumber = z;
                                }
                            }

                            if (largestNumber != 0) {
                                break;
                            }
                        }
                        if ((x * y) == number) {
                            largestNumber = y;
                        }
                    }
                    if (largestNumber != 0) {
                        break;
                    }
                }
            }
            if (largestNumber != 0) {
                break;
            }
        }

        return largestNumber;
    }

    public static boolean isPrime(int n) {
        if (n <= 2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
