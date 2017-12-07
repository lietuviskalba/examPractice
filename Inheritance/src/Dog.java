/**
 * Created by Mantas_MSI on 22-Nov-17.
 */
public class Dog extends Animal {

    @Override
    public void pet() {
        legs = 4;
        seeInDark = false;
        System.out.println("Suted to be house pet with: " + legs + " and can see in the dark? "+seeInDark);
    }
}
