public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        String time = getDurationString(65, 45);
        System.out.println(time);
        time = getDurationString(3945);
        System.out.println(time);
    }

    private static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || (seconds < 0 || seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }
        int hours = minutes / 60;
        minutes = minutes % 60;
        return hours + "h " + minutes + "m " + seconds + "s";
    }

    private static String getDurationString(int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        int minutes = seconds / 60;
        seconds = seconds % 60;

        return getDurationString(minutes, seconds);
    }
}
