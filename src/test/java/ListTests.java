package test.java;


import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.dargueta.data_structures.lists.LinkedList;

/**
 * Created by derek on 11/18/15.
 */
public class ListTests {

    @Test
    public void testAddingToLinkedList() {
        LinkedList ll = new LinkedList();
        assertEquals(ll.getCount(), 0);

        ll.insert(5);
        ll.insert(1);
        ll.insert(9);
        ll.insert(10);
        assertEquals(4, ll.getCount());
    }

    @Test
    public void testGetFromLinkedList() {
        LinkedList ll = new LinkedList();
        ll.insert(5);
        ll.insert(1);
        ll.insert(9);
        ll.insert(10);

        assertEquals(5, ll.get(0));
        assertEquals(1, ll.get(1));
        assertEquals(9, ll.get(2));
        assertEquals(10, ll.get(3));
    }

    @Test
    public void testDeleteFromLinkedList() {
        LinkedList ll = new LinkedList();
        ll.insert(5);
        ll.insert(1);
        ll.insert(9);
        ll.insert(10);

        ll.delete(9);

        assertEquals(3, ll.getCount());
        assertEquals(5, ll.get(0));
        assertEquals(1, ll.get(1));
        assertEquals(10, ll.get(2));

        // TODO - verify that get(3) throws outOfBounds
    }
}
