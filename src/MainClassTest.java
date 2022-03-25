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

    @Test
    public void testGetClassNumber()
    {
        int a = getClassNumber();
        int b = 45;

        Assert.assertTrue("getClassNumber result < or == 45",a > b);
    }

    @Test
    public void testGetClassString()
    {
        String str = getClassString();

        Assert.assertTrue("getClassString result not contains \"hello\" or \"Hello\"",(str.contains("hello")) | (str.contains("Hello")));
    }
}
