public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        if (number < 0 ) {
            number *= -1;
        }

        int reverse = 0;
        int numberToCompare = number;

        while (number > 0) {
            int digit = number % 10;
            reverse *= 10;
            reverse += digit;
            number /= 10;
        }

        if (numberToCompare == reverse) {
            return true;
        }
        return false;
    }
}
