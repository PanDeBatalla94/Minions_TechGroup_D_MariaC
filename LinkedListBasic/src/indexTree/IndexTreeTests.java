package indexTree;

import org.junit.Before;
import org.junit.Test;

public class IndexTreeTests {
    IndexTree indexTree;
    @Before
    public void init() {
        indexTree = new IndexTree<>();
    }

    @Test
    public void addPrintTest() {
        indexTree.addNode(0,1);
        indexTree.addNode(1, 2);
        indexTree.addNode(1, 3);
        indexTree.addNode(2,4);
        indexTree.print();



    }
}
