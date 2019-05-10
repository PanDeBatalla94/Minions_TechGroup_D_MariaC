import java.util.Comparator;
import java.util.LinkedList;

/*
 * SD2x Homework #1
 * Implement the methods below according to the specification in the assignment description.
 * Please be sure not to change the signature of any of the methods!
 */

public class LinkedListUtils {
	
	public static void insertSorted(LinkedList<Integer> list, int value) {
		int node = 0;
		int aux;
		if (list != null) {
			if (list.isEmpty()) {
				list.add(value);
			} else {
				for(int i = 0; i < list.size(); i++ ) {
					if (list.get(i) >= value) {
						list.add(i, value);
						break;
					}
					if (i == list.size() - 1) {
						list.add(value);
						break;
					}
				}
			}
		}

	}
	public static void removeMaximumValues(LinkedList<String> list, int N) {
		int mayor = 0;
		list.sort(Comparator.naturalOrder());
		if (list != null) {
			if(list.size() < N) {
				list.removeAll(list);
			} else {
				for(int i = 0; i < N; i++) {
					list.removeLast();
				}
			}
		}
	}
	
	public static boolean containsSubsequence(LinkedList<Integer> one, LinkedList<Integer> two) {
		int aux;
		boolean containsSubsequence = false;
		if(one == null ||  two == null) {
			return false;
		}

		for (int i = 0; i < one.size(); i++) {
			if (containsSubsequence) { return true;}
			if (one.get(i) == two.get(0)) {
				aux = i;
				for (int j = 0; j < two.size(); j++) {
					if (one.size() - (i +1) < two.size() -1 ) { return false;}
					if (one.get(aux) != two.get(j)) {
						containsSubsequence = false;
						break;
					}
					aux ++; containsSubsequence = true;
				}
			}
		}
		return containsSubsequence;
	}
}
