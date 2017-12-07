import java.util.Stack;

/**
 * Created by Mantas_MSI on 05-Dec-17.
 */
public class MyCollection {

    //What is it? A collection represents a group of objects, known as its elements.
    //Some collections allow duplicate elements and others do not. Some are ordered and others unordered.
    //What is it? When you want something stored.

    public static void main(String[] args) {

        //The stack
        MyStack stack = new MyStack();
        Stack st = new Stack();

        stack.showpush(st, 5);
        stack.showpush(st, 54);
        stack.showpush(st, 77);
        stack.showpop(st);
        stack.showSearch(st, 54);
        stack.showSearch(st, 8);

        stack.showpop(st);
        stack.showpop(st);

        //The queueue
        line();

        MyQueue q = new MyQueue();
        q.playWithQueses();

        //The Map
        line();

        MyMap map = new MyMap();
        map.playWithMaps();

    }

    static void line(){
        for(int i=0;i<50;i++){
            System.out.print("*");
        }
        System.out.println();
    }
}
