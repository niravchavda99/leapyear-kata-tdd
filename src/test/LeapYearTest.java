package test;

import main.Year;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

@Test
public class LeapYearTest {
    @DataProvider(name = "leapYears")
    public Object[] getLeapYears() {
        return new Object[]{2020, 2016, 2012, 2000, 1600};
    }

    @DataProvider(name = "commonYears")
    public Object[] getCommonYears() {
        return new Object[]{1900, 1800, 1700};
    }

    @Test
    public void identifies2021AsNonLeapYear() {
        assertFalse(new Year(2021).isLeap());
    }

    @Test(dataProvider = "commonYears")
    @Parameters("year")
    public void identifiesCommonYears(int year) {
        assertFalse(new Year(year).isLeap());
    }

    @Test(dataProvider = "leapYears")
    @Parameters({"year"})
    public void identifiesLeapYears(int year) {
        assertTrue(new Year(year).isLeap());
    }
}
