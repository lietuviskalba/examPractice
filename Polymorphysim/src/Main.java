/**
 * Created by Mantas_MSI on 22-Nov-17.
 */
public class Main {

    public static void main(String[] args) {

        int n = 2;
        Food[] myFood = new Food[n];
        myFood[0] = new Orange();
        myFood[1] = new Banana();

        for (int i=0; i<n; i++) {

            myFood[i].shoppingCart();
        }

    }
}
