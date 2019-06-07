package customTree;
import org.junit.Before;
import org.junit.Test;

public class CustomTreeTests {
    CustomTree customTree;
    @Before
    public void init() {
        customTree = new CustomTree<>();
    }

    @Test
    public void addPrintTest() {
        customTree.add(1);
        customTree.add(3);
        customTree.add(2);
        customTree.add(10);
        customTree.add(5);
        customTree.add(6);
        customTree.print();

    }
}
