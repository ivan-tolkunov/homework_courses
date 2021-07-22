import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TaskTest {

    @Test
    public void testAmount() {
        int[] array = {4, 5, -6, 4, 5, 3, 4, 2, 4, 5, 7};
        List<NodeNum> list = Task.array(array);
        Assert.assertEquals(list.get(0).amount, 1);
        Assert.assertEquals(list.get(1).amount, 1);
        Assert.assertEquals(list.get(2).amount, 1);
        Assert.assertEquals(list.get(3).amount, 4);
        Assert.assertEquals(list.get(4).amount, 3);
        Assert.assertEquals(list.get(5).amount, 1);
    }

}