import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

/**
 * Created by Nick on 10/3/16.
 */
public class StringCalculatorTest {

    public void shouldReturnZeroWhenEmpty() {
        StringCalculator sc = new StringCalculator();
        int result = sc.Add("");
        int expected = 0;

        assertThat(result, is(expected));
    }


    public void shouldReturnSumWhenOneNum() {
        StringCalculator sc = new StringCalculator();
        int result = sc.Add("5");
        int expected = 5;

        assertThat(result, is(expected));
    }

    @Test
    public void shouldReturnSumWhenTwoNums() {
        StringCalculator sc = new StringCalculator();
        int result = sc.Add("400,6");
        int expected = 406;

        assertThat(result, is(expected));
    }


    public void shouldReturnSumWhenUnknownNums() {
        StringCalculator sc = new StringCalculator();
        int result = sc.Add("4,6,5,10");
        int expected = 25;

        assertThat(result, is(expected));
    }
}