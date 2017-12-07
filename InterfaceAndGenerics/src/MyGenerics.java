/**
 * Created by Mantas_MSI on 04-Dec-17.
 */
public class MyGenerics {

    public static void main(String[] args) {

        //What is it?  designed to extend Java's type system to allow
        // “a type or method to operate on objects of various types while providing compile-time type safety”.
        //A use for it? When you want to compact code and take any type of data

        //why cant I use the int and char
        Integer[] intArr = {5,56,5,8,5147,83};
        Character[] charArr = {'f','t','v','q'};

        printThis(intArr);
        printThis(charArr);

    }

    //generic method
    public  static  <T> void printThis(T[] x){

        for (T anyArr : x) {
            System.out.printf("%s", anyArr);
        }
        System.out.println();

    }
}
