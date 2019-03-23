package pl.sdacademy.TDD.src.test.java.com.jtest.Palindrom;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromTest {

    private Palindrom palindrom;

    @BeforeEach
    void setUp() {
        palindrom = new Palindrom();
    }

    private static Stream<Arguments> testMethodGenerator() {
        return Stream.of(
                Arguments.of("cos soc"),
                Arguments.of("asdfgj klpo oplk jgfdsa"),
                Arguments.of("zx cvbnm mn bvcxz"),
                Arguments.of("qwe rty uiop poi uyt rewq")
        );
    }
    @ParameterizedTest
    @MethodSource("testMethodGenerator")
    void isPalindrom(String testData) {

        //when
        boolean actual= palindrom.isPalindrom(testData);

        //then
        assertTrue(actual);
    }
    @Test
    void isNull(){
        try {
            palindrom.isPalindrom(null);
        }catch (PalindromMustNotBeNull exepcion){
            assertEquals(exepcion.getMessage(),"Word is null");
        }
    }

}
