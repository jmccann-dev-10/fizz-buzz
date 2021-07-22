package learn.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public static String getFizzBuzz(int input) {
        if (input == 0) {
            return Integer.toString(input);
        } else if (input % 3 == 0 && input % 5 == 0) {
            return FIZZ + BUZZ;
        } else if (input % 5 == 0) {
            return BUZZ;
        } else if (input % 3 == 0) {
            return FIZZ;
        }

        return Integer.toString(input);
    }
}
