public class TimeCrunch {

    /*
    Create a program which takes a number in seconds and breaks it down into hours, minutes and seconds.

    Example:
     */
    public static void main(String[] args) {

        int totalSeconds = 360;

        int realHour = totalSeconds / 3600;

        totalSeconds = totalSeconds % 3600;

        int realMin  = totalSeconds / 60;

        totalSeconds = totalSeconds % 60;


        System.out.println("How many hours: " + realHour);
        System.out.println("How many min: " + realMin);
        System.out.println("How many Sec: " + totalSeconds);

    }
}