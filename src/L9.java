import javax.swing.JOptionPane;

public class L9{
    public static void main(String[] args) {

        String firstName;
        String lastName;

        firstName = JOptionPane.showInputDialog("wass your name");
        lastName = JOptionPane.showInputDialog("Last name????");



        JOptionPane.showMessageDialog(null, "WASSSSSSSUP " + firstName+ " " + lastName + "!!");


        //ALL INPUT IS RECEIVED AS A STRING

        int mph, mins;
        double distance, hrs;

        mph =Integer.parseInt( JOptionPane.showInputDialog("How fast were yo going(MPH)"));
        mins = Integer.parseInt(JOptionPane.showInputDialog("How long you are going"));

        hrs = mins/60.0;

        distance = mph * hrs;

        JOptionPane.showMessageDialog(null, "You went " + distance + "miles");
        System.exit(0);
    }

}
