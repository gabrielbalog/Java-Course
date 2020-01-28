public class TeenNumberChecker {
    public static boolean hasTeen(int f, int s, int t) {
        return isTeen(f) || isTeen(s) || isTeen(t);
    }

    public static boolean isTeen(int age) {
        return (age >= 13 && age <= 19);
    }
}
