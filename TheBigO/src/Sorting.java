/**
 * Created by Mantas_MSI on 28-Nov-17.
 */
public class Sorting {

    //sorting is way to organiz elaments in order by a criteria you give
    //One very useful place is when you try to search something. If it is ordered it is 10/10 faster to find it

    //examples of sorting algorithms: Merge sort, Quicksort, Cubesort

    //O(n^2)
    public void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] < arr[j]){//use this to swap
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;

                }

            }
        }
    }
}
