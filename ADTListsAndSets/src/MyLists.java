import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Mantas_MSI on 04-Dec-17.
 */
public class MyLists {



    //can have duplicates

    List<Integer> numArr = new ArrayList();
    List<String> wordArr = new LinkedList();

    public void addNumbers() {
        numArr.add(5);
        numArr.add(44);
        numArr.add(3);
    }

    public void addWords() {
        wordArr.add("Hello");
        wordArr.add("Narnia");
        wordArr.add("No");
    }

    public void showNumbers() {
        for(Object num : numArr){
            System.out.println("The numbers are: " + num);
        }
    }

    public void showWords() {
        for (int i=0; i<wordArr.size();i++){
            System.out.println("The words: " + wordArr.get(i));
        }
    }
}