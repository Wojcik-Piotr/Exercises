package pl.sdacademy.TDD.src.test.java.com.jtest.calculator;

import org.assertj.core.data.Percentage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void isEven() {
        //given
        int testData = 2;

        //when
        boolean actual = calculator.isEven(testData);

        //thena
        assertTrue(actual);

    }

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 3, 0})
    void isEvenParametrized(int testData) {
        //when
        boolean actual = calculator.isEven(testData);

        //thena
        assertTrue(actual);
    }

    @ParameterizedTest
    @MethodSource("evenNumberList")
    void isEvenParametrizedMethodSource(int testData) {
        //when
        boolean actual = calculator.isEven(testData);

        //thena
        assertTrue(actual);

    }

    private static ArrayList<Integer> evenNumberList() {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt() * 2);
        }
        return list;
    }

    @DisplayName("shod divided numbers wihtout errors ")
    @ParameterizedTest
    @MethodSource("testMethodGenerator")
    void divide(double a, double b, double result) {
        //when
        double actual = calculator.divide(a, b);

        //thena
        assertEquals(result, actual);

    }

    private static Stream<Arguments> testMethodGenerator() {
        return Stream.of(
                Arguments.of(5, 5, 1),
                Arguments.of(5, 2, 2.5d),
                Arguments.of(-100, 100, -1),
                Arguments.of(0, 5, 0)
        );
    }

    @DisplayName("shod divided numbers wihtout errors ")
    @ParameterizedTest
    @MethodSource("testMethodGenerator")
    void divideAssertJ(double a, double b, double result) {
        org.assertj.core.api.Assertions.assertThat(calculator.divide(a, b))
                .isEqualTo(result)
                .isNotEqualTo(3)
                .isLessThan(5)
                .isGreaterThan(-2)
                .isBetween(-100.0, 100.0)
                .isCloseTo(5, Percentage.withPercentage(200.0));
    }
}


