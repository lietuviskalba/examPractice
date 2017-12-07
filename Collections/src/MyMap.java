import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mantas_MSI on 05-Dec-17.
 */
public class MyMap {
    //An object that maps keys to values.
    //A map cannot contain duplicate keys; each key can map to at most one value.

    public void playWithMaps(){

        Map m1 = new HashMap();
        m1.put("Zara", "8");
        m1.put("Mahnaz", "31");
        m1.put("Ayan", "12");
        m1.put("Daisy", "14");

        System.out.println();
        System.out.println(" Map Elements");
        System.out.print("\t" + m1);
    }
}
