import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainClassTest extends MainClass {

    @Before
    public void textStartTest()
    {
        System.out.println("Start test");
    }

    @After
    public void textFinishTest()
    {
        System.out.println("Finish test");
    }

    @Test
    public void testGetLocalNumber()
    {
        int expected = 14;
        int actual = getLocalNumber();
        
        Assert.assertTrue("getLocalNumber result != 14",actual == expected);
    }
}
