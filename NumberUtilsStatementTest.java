package com.example;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class NumberUtilsStatementTest {

    @Test
    void testStatementCoverage() {
        NumberUtils utils = new NumberUtils();

        // Ca 1: Chạy qua lệnh null-check
        assertEquals(0, utils.sumOfEvenNumbers(null));

        // Ca 2: Chạy qua vòng lặp, lệnh if (đúng) và cộng tổng
        // Giúp bao phủ dòng `sum += num;` và kết quả trả về
        assertEquals(6, utils.sumOfEvenNumbers(Arrays.asList(2, 4)));
    }
}