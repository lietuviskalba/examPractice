import java.util.Random;

/**
 * Created by Mantas_MSI on 22-Nov-17.
 */
public class OnSqr {

    public static void main(String[] args) {

        Random random = new Random();
        int n = random.nextInt(10);

        for(int i=1; i<n; i++){

            System.out.println(i+")");
            for(int j=1; j<n; j++){

                System.out.println(j + ") The O(n^2) is used: " + j + " times.");
            }
        }
    }
}
