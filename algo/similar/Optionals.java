package similar;

import java.util.Objects;
import java.util.Optional;
import java.util.Random;
import java.util.function.Supplier;

/**
 * @author Vishnu on 28-02-2021
 */
public class Optionals {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) throws Throwable {
        Optional<Integer> randomInt = getRandomInt(args);
		Integer orElse = randomInt.orElseThrow(
				() -> new IllegalArgumentException("Integer value should not be negative") );
        Objects.requireNonNull(orElse);
    }
    
    private static Integer doPrintValue(int integer) {
        if (integer < 0) {
            throw new IllegalArgumentException("Integer value should not be negative");
        }
        return integer;
    }

    private static Optional<Integer> getRandomInt(String[] args) {
        int nextInt = RANDOM.nextInt();
        if (args.length != 0) {
            if (args[0].equals("null")) {
                return Optional.empty();
            } else {
                return Optional.of(Integer.valueOf(args[0]));
            }
        } else {
            return Optional.of(Math.abs(nextInt));
        }
    }
}
