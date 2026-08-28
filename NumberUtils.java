package com.example;

import java.util.List;

public class NumberUtils {

    /**
     * Phương thức tính tổng các số chẵn trong danh sách.
     */
    public int sumOfEvenNumbers(List<Integer> numbers) {
        if (numbers == null) {
            return 0;
        }

        int sum = 0;
        for (Integer num : numbers) { // Vòng lặp
            if (num != null && num % 2 == 0) { // Lệnh rẽ nhánh
                sum += num;
            }
        }
        return sum;
    }
}