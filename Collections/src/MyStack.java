import java.util.Stack;

/**
 * Created by Mantas_MSI on 05-Dec-17.
 */
public class MyStack {

    //represents a last-in-first-out (LIFO) stack of objects.
    //peek returns elament but does not kill it
    //pop returns elament and kill it
    //push add that to the top and returns it


    public void showpush(Stack st, int a) {
        st.push(new Integer(a));
        System.out.println("push(" + a + ")");
        System.out.println("stack: " + st);
    }

    public void showSearch(Stack st, int a) {
        st.search(new Integer(a));
        System.out.println("search(" + a + ")");
        System.out.println("stack: " + st);
    }

    public void showpop(Stack st) {
        System.out.print("pop -> ");
        Integer a = (Integer) st.pop();
        System.out.println(a);
        System.out.println("stack: " + st);
    }
}
