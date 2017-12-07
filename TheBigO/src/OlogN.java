import java.util.Random;

/**
 * Created by Mantas_MSI on 22-Nov-17.
 */
public class OlogN {

    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(20);

        System.out.println("At start n is: " + n);

        while(n > 0){
            n/=2;
            System.out.println("The n times: " + n);
        }
    }
}
