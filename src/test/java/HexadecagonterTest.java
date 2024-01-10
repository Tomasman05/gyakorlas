import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lan.zold.Hexadecagonter;

public class HexadecagonterTest {

    Hexadecagonter hexadecagonter;

    @BeforeTest
    public void setUp(){
        hexadecagonter = new Hexadecagonter();

    }


    @Test
    public void testCalcArea_30(){
        double actual = hexadecagonter.calcArea(30);
        double expected = 18098.422;
        Assert.assertEquals(actual, expected,0.1);
    }
}
