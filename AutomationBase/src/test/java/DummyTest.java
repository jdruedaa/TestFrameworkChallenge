import org.testng.Assert;
import org.testng.annotations.Test;

public class DummyTest {

    @Test
    public void test1()
    {
        int x = 4;
        int y = 6;
        Assert.assertEquals(x+y,10);
    }
}
