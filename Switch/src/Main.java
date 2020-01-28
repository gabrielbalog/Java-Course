public class Main {
    public static void main(String[] args) {
        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was a 3, or a 4, or a 5");
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        char myChar = 'E';

        switch (myChar) {
            case 'A':
                System.out.println("Found A");
                break;
            case 'B':
                System.out.println("Found B");
                break;
            case 'C':
                System.out.println("Found C");
                break;
            case 'D':
                System.out.println("Found D");
                break;
            case 'E':
                System.out.println("Found E");
                break;
            default:
                System.out.println("Not Found");
                break;
        }

        String month = "january";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
            default:
                System.out.println("Not sure");
        }
    }
}
