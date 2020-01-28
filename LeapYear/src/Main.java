public class Main {
    public static void main(String[] args) {
        boolean leap = LeapYear.isLeapYear(-1600);
        System.out.println(leap);
        leap = LeapYear.isLeapYear(1600);
        System.out.println(leap);
        leap = LeapYear.isLeapYear(2017);
        System.out.println(leap);
        leap = LeapYear.isLeapYear(1924);
        System.out.println(leap);
    }
}
