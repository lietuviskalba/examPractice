/**
 * Created by Mantas_MSI on 04-Dec-17.
 */
public class Main implements MyInterface{
    public static void main(String[] args) {

        Main main = new Main();
        main.sayHello();
        System.out.println("The year is: " + MyInterface.year);

    }

    public void sayHello(){
        System.out.println("Hello verable: " + MyInterface.hello);

    }
}
