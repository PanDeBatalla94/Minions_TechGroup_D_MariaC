import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CustomStackTests {

    private CustomStack<Integer> customStack;

    @Before
    public void init() {
        customStack = new CustomStack<>();
    }

    @Test
    public void pushTest() {
        customStack.push(5);
        customStack.push(4);
        assertEquals(customStack.peek().value, 4);

    }

    @Test
    public void popTest() {
        customStack.push(1);
        customStack.push(2);
        customStack.push(3);

        assertEquals(customStack.peek().value, 3);
    }

    @Test
    public void peekTest() {
        customStack.push(1);
        customStack.push(2);
        customStack.push(3);

        assertEquals(customStack.peek().value, 3);
        customStack.pop();
        assertEquals(customStack.peek().value, 2);
    }
}
