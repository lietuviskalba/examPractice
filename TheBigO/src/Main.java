import java.util.ArrayList;

/**
 * Created by Mantas_MSI on 28-Nov-17.
 */
public class Main {
    public static void main(String[] args) {

        //OOP Object oriented programing is not when you just build a fcking wall of code, but rather break it up into smaller tiny programs.

        int arr[] = {1,5,7,1,55,4,8,66,4,2,8,8,6,-1,4,8,8,8};

        //======================================================= Sort
//        Sorting sort = new Sorting();
//        sort.bubbleSort(arr);
//
//        System.out.println("Array After Bubble Sort");
//        for(int i=0; i < arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println(" ");

        //======================================================== SEARCH
        System.out.println("Search");
        Search search = new Search();
        System.out.println(search.contains(arr, 66));

    }
}
