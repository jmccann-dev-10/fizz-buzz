import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static learn.fizzbuzz.FizzBuzz.*;

public class FizzBuzzTest {

    @Test
    public void shouldBeFizzWhen3() {
        int num = 3;
        String result = processFizzBuzz(num);
        assertEquals(result, FIZZ);
    }

    @Test
    public void shouldBeFizzWhenMultipleOf3() {
        int num = 3 * 4;
        String result = processFizzBuzz(num);
        assertEquals(result, FIZZ);
    }

    @Test
    public void shouldBeBuzzWhen5() {
        int num = 5;
        String result = processFizzBuzz(num);
        assertEquals(result, BUZZ);
    }

    @Test
    public void shouldBeBuzzWhenMultipleOf5() {
        int num = 5 * 4;
        String result = processFizzBuzz(num);
        assertEquals(result, BUZZ);
    }

    @Test
    public void shouldReturnFizzBuzzWhenProductOf3And5() {
        int num = 3 * 5;
        String result = processFizzBuzz(num);
        assertEquals(result, FIZZ + BUZZ);
    }

    @Test
    public void shouldReturnFizzBuzzWhenMultipleOf3And5() {
        int num = 5 * 7 * 3 * 4;
        String result = processFizzBuzz(num);
        assertEquals(result, FIZZ + BUZZ);
    }

    @Test
    public void shouldReturnNumberWhenNotMultipleOf3Or5() {
        int num = 11;
        String result = processFizzBuzz(num);
        assertEquals(Integer.toString(num), result);

        num = 17;
        result = processFizzBuzz(num);
        assertEquals(Integer.toString(num), result);
    }

    @Test
    public void shouldNotReturnFizzOrBuzzWhen0() {
        int num = 0;
        String result = processFizzBuzz(num);
        assertNotEquals(result, FIZZ);
        assertNotEquals(result, BUZZ);
        assertNotEquals(result, FIZZ + BUZZ);
    }

}
