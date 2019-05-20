import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CustomListsTests {
    private CustomList customList;
    @Before
    public void init() {
        customList = new CustomList();
    }
    @Test
    public void addTests() {
        customList.addFirst(1);
        customList.addLast(7);
        customList.add(1,2);
        customList.add(2,3);
        customList.add(3,4);
        customList.add(4,5);
        customList.add(5,6);

        assertEquals("values are not equals ", customList.getIndex(1).value, 2);
        assertEquals("values are not equals ", customList.getIndex(2).value, 3);
        assertEquals("values are not equals ", customList.getIndex(3).value, 4);
        assertEquals("values are not equals ", customList.getIndex(4).value, 5);
        assertEquals("values are not equals ", customList.getIndex(5).value, 6);
    }

    @Test
    public void removeTests() {
        customList.addFirst(1);
        customList.addLast(7);
        customList.add(1,2);
        customList.add(2,3);
        customList.add(3,4);
        customList.add(4,5);
        customList.add(5,6);

        customList.remove(3);

        assertEquals("values are not equals ", customList.getIndex(1).value, 2);
        assertEquals("values are not equals ", customList.getIndex(2).value, 3);
        assertEquals("values are not equals ", customList.getIndex(3).value, 5);
        assertEquals("values are not equals ", customList.getIndex(4).value, 6);
        assertEquals("values are not equals ", customList.getIndex(5).value, 7);
    }

    @Test
    public void removeFirstTests() {
        customList.addFirst(1);
        customList.addLast(7);
        customList.add(1,2);
        customList.add(2,3);
        customList.add(3,4);
        customList.add(4,5);
        customList.add(5,6);

        customList.removeFirst();

        assertEquals("values are not equals ", customList.getIndex(0).value, 2);
        assertEquals("values are not equals ", customList.getIndex(1).value, 3);

    }
}
