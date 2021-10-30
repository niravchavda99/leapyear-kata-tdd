package test;

import main.Year;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
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
    public void identifies1900AsCommonYear() {
        assertFalse(new Year(1900).isLeap());
    }

    @DataProvider(name = "leapYears")
    public Object[] getLeapYears() {
        return new Object[]{2020, 2016, 2012};
    }

    @Test(dataProvider = "leapYears")
    @Parameters({"year"})
    public void identifiesLeapYears(int year) {
        assertTrue(new Year(year).isLeap());
    }
}
