package test;

import main.Year;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

@Test
public class LeapYearTest {
    @Test
    public void identifies2021AsNonLeapYear() {
        assertFalse(new Year(2021).isLeap());
    }

    @Test
    public void identifies2020AsLeapYear() {
        assertTrue(new Year(2020).isLeap());
    }

    @Test
    public void identifies2016AsLeapYear() {
        assertTrue(new Year(2016).isLeap());
    }

    @Test
    public void identifies2012AsLeapYear() {
        assertTrue(new Year(2012).isLeap());
    }
}
