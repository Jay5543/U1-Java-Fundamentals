public class SalesTax {

    /*
    Create a program which takes a quantity, price and tax percentage and outputs the total cost with tax.
     */

    public static void main(String[] args) {

        //declare and intialaize varibales

        double price = 9.99;
        int quantity = 6;
        double _tax = 7;
        final double TAX = _tax/100;



        //calculation

        double subTotal = price * quantity;
        double taxTotal = subTotal * TAX;
        double totalCost = subTotal + taxTotal;

        System.out.println("You Scanned " + quantity + " at the price of " + price + " Pre item you scanned");
        System.out.println("Subtotal: " + subTotal);
        System.out.println("Tax: " + TAX);
        System.out.println("Total: " + totalCost);

        // DISCOUNT and INCREASE

        //Formula: Amount * (1 + or - %) = Total
    }


}
