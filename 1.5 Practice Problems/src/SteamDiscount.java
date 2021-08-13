public class SteamDiscount {

    /*
    A game on Steam costs $60.00, but is currently on sale for 20% off. Create a program to display how much the game costs after the discount.
     */


    public static void main(String[] args) {
        double realPrice = 60.00;
        double discount = 20.00;

        double currentDiscount = 1 - discount/100;

        double currentPrice = realPrice * currentDiscount;

        System.out.println("Your cost is: $" + currentPrice);
    }
}
