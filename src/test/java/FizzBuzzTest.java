import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static learn.fizzbuzz.FizzBuzz.*;

public class FizzBuzzTest {

    @Test
    public void multiplesOfThreeShouldReturnFizz() {
        int num = 3;
        String result = getFizzBuzz(num);
        assertEquals(result, FIZZ);

        num *= 4;
        result = getFizzBuzz(num);
        assertEquals(result, FIZZ);
    }

    @Test
    public void multiplesOfFiveShouldReturnBuzz() {
        int num = 5;
        String result = getFizzBuzz(num);
        assertEquals(result, BUZZ);

        num *= 4;
        result = getFizzBuzz(num);
        assertEquals(result, BUZZ);
    }

    @Test
    public void multipleOfThreeAndFiveShouldReturnFizzBuzz() {
        int num = 15;
        String result = getFizzBuzz(num);
        assertEquals(result, FIZZ + BUZZ);

        num *= 4;
        result = getFizzBuzz(num);
        assertEquals(result, FIZZ + BUZZ);
    }

    @Test
    public void anyOtherNumberShouldBeReturned() {
        int num = 11;
        String result = getFizzBuzz(num);
        assertEquals(Integer.toString(num), result);

        num = 17;
        result = getFizzBuzz(num);
        assertEquals(Integer.toString(num), result);
    }

    @Test
    public void zeroShouldNotReturnFizzOrBuzz() {
        int num = 0;
        String result = getFizzBuzz(num);
        assertNotEquals(result, FIZZ);
        assertNotEquals(result, BUZZ);
        assertNotEquals(result, FIZZ + BUZZ);
        assertEquals(result, Integer.toString(num));
    }

}
