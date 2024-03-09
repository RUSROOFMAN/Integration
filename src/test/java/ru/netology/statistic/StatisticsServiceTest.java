package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expectedMax = 12;
        long actualMax = service.findMax(incomesInBillions);
        Assertions.assertEquals(expectedMax, actualMax);
    }

    @Test
    void findMaxIn100() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 22,};
        long expectedMax = 22;
        long actualMax = service.findMax(incomesInBillions);
        Assertions.assertEquals(expectedMax, actualMax);
    }
}
