import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PredicateTest {

    @Test
    public void test_Predicate_Not() {

        String[] names = { "TEST", "MARY", " ", "" };

        List loweCaseList = Stream.of(names).filter(Predicate.not(String::isBlank))
                .collect(Collectors.toList());
        assertEquals(2, loweCaseList.size());
    }
}
