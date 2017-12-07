import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * Created by Mantas_MSI on 05-Dec-17.
 */
public class MyQueue {

    //designed for holding elements prior to processing.
    // queues provide additional insertion, extraction, and inspection operations
    //order elements in a FIFO (first-in-first-out)
    //has more shit like:
    //add adds new elaments returns true
    //offer just adds new elemant
    //remove removes and returns that ass
    //poll get and remove the head of the queeee or null if iz empty
    //elament get but dont remove the head of the elemant
    //same as eleamnt but also get null if the queeueue is empty


        public  void playWithQueses(){
            PriorityQueue<String> queue=new PriorityQueue<String>();
            queue.add("House");
            queue.add("Car");
            queue.add("Dog");

            System.out.println("head with .elament:"+queue.element());
            System.out.println("head with .peek:"+queue.peek());
            System.out.println("iterating the queue elements:");
            Iterator itr=queue.iterator();

            while(itr.hasNext()){
                System.out.println("--> " + itr.next());
            }

            queue.remove();
            queue.poll();
            System.out.println("after removing two elements while using .remove and .peek:");

            Iterator<String> itr2=queue.iterator();

            while(itr2.hasNext()){
                System.out.println("--> " + itr2.next());
            }
        }

}
