/**
 * Created by Mantas_MSI on 22-Nov-17.
 */
public class Main {
    public static void main(String[] args) {

        //Object oriented programing is not when you just build a fcking wall of code, but rather break it up into smaller tiny programs.

        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();

        animal.pet();
        dog.pet();
        cat.pet();

        System.out.println(" Dog legs: " + dog.legs);
        System.out.println(" Cat legs: " + cat.legs);
        System.out.println(" Cat see in darkness: " + cat.seeInDark);
        System.out.println(" Dog sleep: " + dog.sleep(5));

    }
}
