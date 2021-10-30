package test;

import main.Year;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertFalse;

@Test
public class LeapYearTest {
    @Test
    public void identifies2021AsNonLeapYear() {
        assertFalse(new Year(2021).isLeap());
    }
}
