import java.lang.annotation.*;
import java.util.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CacheResult {}

class Computation {
    private static final Map<Integer, Integer> cache = new HashMap<>();

    @CacheResult
    public int expensiveCalculation(int input) {
        if (cache.containsKey(input)) {
            return cache.get(input);
        }
        int result = input * input; // Simulating computation
        cache.put(input, result);
        return result;
    }
}