import java.util.HashSet;
import java.util.Set;

/**
 * Created by Mantas_MSI on 05-Dec-17.
 */
public class MySets {

    public  void playWithSets(){

        Set setA = new HashSet();

        String element = "element 1";

        setA.add(element);
        setA.add("Lol");
        setA.add("house");
        setA.add("hosue");

        System.out.println("Does it contain stuff?" + setA.contains(element) );
        System.out.println("What is the size of the set?" + setA.size());

        for(Object o : setA){
            System.out.println("The items in the set: " + o);
        }
    }
}
