/**
 * Created by Mantas_MSI on 05-Dec-17.
 */
public class MyThreads implements Runnable{//or extends thread

    //What is it? thread is an independent path of execution within a program. Many threads can run concurrently within a program
    //What is it good for? when you need to run multiple shit at once


        @Override
        public void run(){

            System.out.println("Whatz up world");
        }


    public static void main(String[] args) {

        Thread myThread = new Thread(new MyThreads(), "Justin the thread");

        System.out.println(myThread.getName());
        myThread.start();
    }


}
