/**
 * Created by Mantas_MSI on 04-Dec-17.
 */
public interface MyInterface {

    //What is it? A Java interface is a bit like a class, except a Java interface can only contain method
    //signatures and fields. An Java interface cannot contain an implementation of the methods, only the signature
    //(name, parameters and exceptions) of the method.
    //What can you use it for? You can use interfaces in Java as a way to achieve polymorphism

    public String hello = "Hello";
    public int year = 2017;

    public void sayHello();
}
