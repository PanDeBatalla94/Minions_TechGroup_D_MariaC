import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CustomQueueTest {

    private CustomQueue<Integer> customQueue;

    @Before
    public void init() {
        customQueue = new CustomQueue<>();
    }

    @Test
    public void addTest() {
        customQueue.add(5);
        assertEquals(customQueue.peek().value, 5);

    }

    @Test
    public void removeTest() {
        customQueue.add(1);
        customQueue.add(2);
        customQueue.add(3);

        Node a = customQueue.remove();
        assertEquals(a.value, 1);
    }

    @Test
    public void peekTest() {
        customQueue.add(1);
        customQueue.add(2);
        customQueue.add(3);

        assertEquals(customQueue.peek().value, 1);
        customQueue.remove();
        assertEquals(customQueue.peek().value, 2);
    }
}
