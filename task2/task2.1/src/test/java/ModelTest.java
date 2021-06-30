package test.java;

import com.company.GlobalConstants;
import com.company.Model;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by zxcubika on 29.06.2021.
 */
public class ModelTest {

    @Test
    public void checkUserNumber() {
        Model model = new Model();
        Assertions.assertEquals(model.checkUserNumber(-1), Model.Result.Error);
        model.setRandomNumber(10);
        Assertions.assertEquals(model.checkUserNumber(1), Model.Result.TooSmall);
        model.setRandomNumber(50);
        Assertions.assertEquals(model.checkUserNumber(78), Model.Result.TooBig);
    }

    @Test
    public void randomNumber() {
        Model model = new Model();
        int i = 0;
        while (i <= 1000) {
            int number = model.randomNumber(GlobalConstants.PRIMARY_MIN_BARRIER, GlobalConstants.PRIMARY_MAX_BARRIER);
            if (number < 0 || number > 100) Assertions.fail();
            i++;
        }
    }
}