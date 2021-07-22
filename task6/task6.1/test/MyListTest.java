import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class MyListTest {
    MyList myList;

    @Before
    public void addElementsInList() {
        myList = new MyList();
        myList.addElement(5);
        myList.addElement(10);
        myList.addElement(43);
        myList.addElement(21);
        myList.addElement(18);
    }

    @Test
    public void checkHead() {
        Assert.assertEquals(myList.head.getNumber(), 5);
    }

    @Test
    public void checkElements() {
        Assert.assertEquals(myList.head.getNext().getNumber(), 10);
        Assert.assertEquals(myList.head.getNext().getNext().getNumber(), 43);
        Assert.assertEquals(myList.head.getNext().getNext().getNext().getNumber(), 21);
    }

    @Test
    public void checkTail() {
        Assert.assertEquals(myList.tale.getNumber(), 18);
    }

}