public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        int myFirstInt = (int) (firstNumber * 1000);
        int mySecondInt = (int) (secondNumber * 1000);

        return myFirstInt == mySecondInt;
    }
}
