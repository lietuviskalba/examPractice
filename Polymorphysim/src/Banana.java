/**
 * Created by Mantas_MSI on 22-Nov-17.
 */
public class Banana extends Food{

    //Polymohpsym: Subclasses of a class can define their own unique behaviors and yet share some of the same functionality of the parent class
    //When you have that one specific thing in that class

    @Override
    public void shoppingCart() {
        amount = 9;
        color = "yellow";

        System.out.println(" This shopping cart has: " + amount + " of " + this + " with the color: " + color);
    }
}
