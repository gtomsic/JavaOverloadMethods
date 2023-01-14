public class MinutesToYearsAndDays {
    public static void main(String[] args) {
        printYearsAndDays(0);
    }

    public static void printYearsAndDays(long minutes) {
        if(minutes < 0) {
            System.out.println("Invalid Value\n");
            return;
        }
        int hour = 60;
        int day = 24;
        int year = 365;

        int getYear = (int) ((minutes / hour) / day) / year;
        int getRemainingDay = (int) ((minutes / hour / day) % year);

        System.out.println(minutes + " min = " + getYear + " y and " + getRemainingDay + "0");
    }


}
