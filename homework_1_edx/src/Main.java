import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        /*
        * Insert Sorted
        */
        LinkedListUtils linkedLists = new LinkedListUtils();
        LinkedList<Integer> list = new LinkedList<>();
        list.add(4);
        list.add(2);
        linkedLists.insertSorted(list, 3);
        System.out.println(list);

        list.clear();
        list.add(1);
        list.add(4);
        linkedLists.insertSorted(list, 3);
        System.out.println(list);

        list.clear();
        list.add(1);
        list.add(4);
        linkedLists.insertSorted(list, 6);
        System.out.println(list);

        /*
        * removeMaximumValues
        */
        LinkedList<String> listString = new LinkedList<>();
        listString.add("aguila");
        listString.add("loro");
        listString.add("toro");
        listString.add("langosta");
        listString.add("gato");
        listString.add("perro");
        linkedLists.removeMaximumValues(listString, 4);
        System.out.println(listString);

        /*
        * Contains subsequence*/

        LinkedList<Integer> one = new LinkedList<>();
        one.add(1);
        one.add(3);
        one.add(4);
        one.add(5);
        one.add(3);
        one.add(7);

        LinkedList<Integer> two = new LinkedList<>();
        two.add(4);
        two.add(5);
        System.out.println("List one contains list two?: " + linkedLists.containsSubsequence(one, two));
    }
}
