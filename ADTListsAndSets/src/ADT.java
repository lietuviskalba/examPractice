/**
 * Created by Mantas_MSI on 04-Dec-17.
 */
public class ADT {

    //What is it? data type, where only behavior is defined but not implementation.
    //Used for? Array, List, Map, Queue, Set, Stack, Table, Tree, and Vector
    //Real life example: Book is Abstract (Telephone Book is an implementation)

    public static void main(String[] args) {

        MyLists lists = new MyLists();

        lists.addNumbers();
        lists.addWords();

        lists.showNumbers();
        lists.showWords();

        MySets sets = new MySets();

        sets.playWithSets();
    }
}
