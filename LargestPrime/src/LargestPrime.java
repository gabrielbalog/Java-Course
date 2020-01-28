//    Write a method named getLargestPrime with one parameter of type int named number.
//    If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value
//    The method should calculate the largest prime factor of a given number and return it
//    EXAMPLE INPUT/OUTPUT
//    * getLargestPrime (21); should return 7 since 7 is the largest prime (3 * 7 = 21
//    * getLargestPrime (217); should return 31 since 31 is the largest prime (7 * 31 = 217
//    * getLargestPrime (0); should return -1 since 0 does not have any prime number
//    * getLargestPrime (45); should return 5 since 5 is the largest prime (3 * 3 * 5 = 45
//    * getLargestPrime (-1); should return -1 since the parameter is negative
//    HINT: Since the numbers 0 and 1 are not considered prime numbers, they cannot contain prime numbers
//    NOTE: The method getLargestPrime should be defined as public static like we have been doing so far in the course
//    NOTE: Do not add a main method to the solution code.

public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }

        int largestNumber = 0;

        for (int x = 2; x <= number; x++) {
            if (x == number) {
                largestNumber = x;
                break;
            }
            for (int i = 2; i < Math.sqrt(x); i++) {
                if (x % i != 0) {
                    break;
                }
            }
            for (int y = 2; (y * x) <= number; y++) {
                for (int i = 2; i < Math.sqrt(y); i++) {
                    if (y % i != 0) {
                        break;
                    }
                }
                for (int z = 2; (y * x * z) <= number; z++) {
                    for (int i = 2; i < Math.sqrt(z); i++) {
                        if (z % i != 0) {
                            break;
                        }
                    }
                    for (int a = 2; (y * x * z * a) <= number; a++) {
                        for (int i = 2; i < Math.sqrt(a); i++) {
                            if (a % i != 0) {
                                break;
                            }
                        }
                        if ((x * y * a * z) == number) {
                            largestNumber = a;
                        }

                        if (largestNumber != 0) {
                            break;
                        }
                    }
                    if ((x * y * z) == number) {
                        largestNumber = z;
                    }

                    if (largestNumber != 0) {
                        break;
                    }
                }
                if ((x * y) == number) {
                    largestNumber = y;
                }
                if (largestNumber != 0) {
                    break;
                }
            }
            if (largestNumber != 0) {
                break;
            }
        }

        return largestNumber;
    }
}
