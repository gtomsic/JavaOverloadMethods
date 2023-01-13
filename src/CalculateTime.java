public class CalculateTime {
    public static void main(String[] args) {
        System.out.println(getDurationString(3989)); // This is the first test case
        System.out.println(getDurationString(65, 45)); // Second test case
    }

    public static String getDurationString(int seconds) {
        // Two steps approach get the hours
        if(seconds < 0) {
            return "Invalid data for seconds(" + seconds
                    + "), must have positive integer value";
        }
        return getDurationString(seconds / 60, seconds % 60);
    }

    public static String getDurationString(int minutes, int seconds) {
        if(minutes < 0) {
            return "Invalid data for minutes(" + minutes
                    + "), must have positive integer value";
        }

        if(seconds <= 0 || seconds > 59) {
            return "Invalid data for seconds(" + seconds + "), must between 0 and 59";
        }

        // Two steps approach get the hours
        int hours = minutes / 60;

        int remainingMinutes = minutes % 60;

        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }
}
