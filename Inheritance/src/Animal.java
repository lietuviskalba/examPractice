/**
 * Created by Mantas_MSI on 22-Nov-17.
 */
public class Animal {

    //In object-oriented programming, inheritance is when an object or class is based on another
    //object or class.
    //one object acquires all the properties and behaviours of the parent object.
    //Good when you don't want to reacrete a new class each and every time


    public int legs = 0;
    public boolean seeInDark = false;
    public double speed = 0.0;



    public int sleep(int hours){
        return hours;
    }

    public void  pet() {
        System.out.println("Suted to be house pet with: " + legs + " and can see in the dark? "+seeInDark);
    }
}
