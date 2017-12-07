import java.util.Random;

/**
 * Created by Mantas_MSI on 22-Nov-17.
 */
public class On {

    public static void main(String[] args) {

        Random random = new Random();
        int n = random.nextInt(10);
        int i = 0;

        System.out.println("n is: " + n);

        while( i< n) {
            i++;
            System.out.println(i+") The i in O(n) is done: " + i + " times.");
        }

    }
}
