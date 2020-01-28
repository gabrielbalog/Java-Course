public class Main {
    public static void main(String[] args) {
        boolean eq = EqualSumChecker.hasEqualSum(1,1,1);
        System.out.println(eq);
        eq = EqualSumChecker.hasEqualSum(1,1,2);
        System.out.println(eq);
        eq = EqualSumChecker.hasEqualSum(1,-1,0);
        System.out.println(eq);
        eq = EqualSumChecker.hasEqualSum(1,1,1);
        System.out.println(eq);
    }
}
