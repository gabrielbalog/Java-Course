public class Main {
    public static void main(String[] args) {
        boolean myTeens = TeenNumberChecker.hasTeen(9, 99, 19);
        System.out.println(myTeens);
        myTeens = TeenNumberChecker.hasTeen(23,15,42);
        System.out.println(myTeens);
        myTeens = TeenNumberChecker.hasTeen(22,23,34);
        System.out.println(myTeens);
    }
}
