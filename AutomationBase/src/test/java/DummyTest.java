import org.testng.Assert;
import org.testng.annotations.Test;
import utils.MathUtils;

public class DummyTest {

    @Test
    public void test1()
    {
        int x = 4;
        int y = 6;
        Assert.assertEquals(MathUtils.sum(x,y),10);
    }
}
