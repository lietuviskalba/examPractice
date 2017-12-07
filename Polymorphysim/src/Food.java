/**
 * Created by Mantas_MSI on 22-Nov-17.
 */
public class Food {

    public  int amount;
    public  String color;

    public void shoppingCart() {
        amount = 5;
        color = "green";

        System.out.println(" This shopping cart has: " + amount + " of " + this + " with the color: " + color);
    }
}
