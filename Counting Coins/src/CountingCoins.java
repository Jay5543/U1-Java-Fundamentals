public class CountingCoins {

    /*
    Create a program which will make change, converting values of under $1 to their accurate quantity and type of coins.
    Example:   $0.51 -> 2 quarters and 1 penny.
     */

    public static void main(String[] args) {

        double rawChange = 0.66;
        //Casting, forcing it to a different type
        int realChange = (int) (rawChange  * 100);

        int knownQuarters = realChange / 25;

        realChange = realChange % 25;

        int knownDimes = realChange / 10;

        realChange = realChange % 10;

        int knownNickels = realChange / 5;

        realChange = realChange % 5;

        int knownPennies = realChange / 1;

        System.out.println("Total change is: " + rawChange);
        System.out.println("Total Quarters is: " + knownQuarters);
        System.out.println("Total Dimes is: " + knownDimes);
        System.out.println("Total Nickels is: " + knownNickels);
        System.out.println("Total Pennies is: " + knownPennies);


    }
}
