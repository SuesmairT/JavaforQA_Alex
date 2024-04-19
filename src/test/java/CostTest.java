import Telran.Lesson100424.Cost;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class CostTest {

    @Test
    void deliveryCostCalc() {
        Cost cost = new Cost();
        assertEquals(420,
                cost.deliveryCostCalc(5, true, false,"высокая"));
    }
//Параметризированный тест, сделать 5 случаев
    @ParameterizedTest
    @MethodSource("validData")
    void deliveryCostCalc(double distanceValue, boolean bigValue, boolean fragileValue, String loadValue, double result) {
        Cost cost = new Cost();
        assertEquals(result, cost.deliveryCostCalc(distanceValue,bigValue,fragileValue,loadValue));
    }

    static Stream<Arguments> validData(){
        return Stream.of(
                arguments(5, true, false,"высокая",420),
                arguments(10.1, false, true,"очень высокая",960)

        );
    }
}

//add 5 more test data suites