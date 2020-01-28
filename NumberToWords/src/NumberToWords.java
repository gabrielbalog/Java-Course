public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int reversedNumber = reverse(number);
            int digitsCount = getDigitCount(number);

            for (int i = 0; i < digitsCount; i++){
                int digit = reversedNumber % 10;
                switch (digit) {
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    case 0:
                        System.out.println("Zero");
                }

                reversedNumber /= 10;
            }
        }
    }

    public static int reverse(int number) {
        boolean isNegative = false;
        if (number < 0) {
            isNegative = true;
            number *= -1;
        }

        int reversedNumber = 0;
        while (number > 0) {
            int digit = number % 10;

            reversedNumber *= 10;
            reversedNumber += digit;

            number /= 10;
        }

        if (isNegative) {
            return reversedNumber * -1;
        }

        return reversedNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0 ) {
            return -1;
        }

        int count = 0;

        do {
            count++;
            number /= 10;
        } while (number != 0);

        return count;
    }
}
