package Protected;

/**
 * Created by Mantas_MSI on 22-Nov-17.
 */
public class AccessModifiers {

    public      int number1 = 1;
    private     int number2 = 2;
    protected   int number3 = 3;

    private int age;

    public void setAge(int age) {




        if (age >= 0 && age <= 120) {
            this.age = age;
        }else{
            throw new RuntimeException("Hello");
           // System.out.println(" HEY THE AGE IS BAD ");

        }

    }

    public int getAge() {
        return age;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int getNumber3() {
        return number3;
    }

    public void setNumber3(int number3) {
        this.number3 = number3;
    }
}
