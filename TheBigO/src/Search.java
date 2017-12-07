/**
 * Created by Mantas_MSI on 28-Nov-17.
 */
public class Search {

    //A way to find what you need
    //good when you have lots of stuff and need to find that one thing

    //O n thing
    public boolean contains(int[] a, int b){
        for (int i : a) {
            if (i==b){
                return true;
            }
        }
        return false;
    }
}

