package com.example;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import static org.junit.jupiter.api.Assertions.*;

public class NumberUtilsPathTest {

    private final NumberUtils utils = new NumberUtils();

    @Test
    void testPath1_NullInput() {
        assertEquals(0, utils.sumOfEvenNumbers(null));
    }

    @Test
    void testPath2_EmptyList() {
        assertEquals(0, utils.sumOfEvenNumbers(Collections.emptyList()));
    }

    @Test
    void testPath3_ListWithOddNumbersOnly() {
        assertEquals(0, utils.sumOfEvenNumbers(Arrays.asList(1, 3, 5)));
    }

    @Test
    void testPath4_ListWithEvenNumbersOnly() {
        assertEquals(10, utils.sumOfEvenNumbers(Arrays.asList(4, 6)));
    }

    @Test
    void testPath5_ListWithNullAndMixedNumbers() {
        assertEquals(2, utils.sumOfEvenNumbers(Arrays.asList(null, 2, 3)));
    }
}