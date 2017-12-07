/**
 * Created by Mantas_MSI on 22-Nov-17.
 */
public class Orange extends Food {

    @Override
    public void shoppingCart() {
        amount = 2;
        color = "orange";

         System.out.println(" This shopping cart has: " + amount + " of " + this + " with the color: " + color);
    }
}
