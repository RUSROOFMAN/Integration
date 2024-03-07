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
    void findMin() {
        StatisticsService service = new StatisticsService();
        long[] iincomesInBillion = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expectedMin = 3;
        long actualMin = service.findMin(iincomesInBillion);
        Assertions.assertEquals(expectedMin, actualMin);
    }

    @Test
    void findMid() {
        StatisticsService service = new StatisticsService();
        long[] iincomesInBillion = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expectedMid = 1;
        long actualMid = service.findMid(iincomesInBillion);
        Assertions.assertEquals(expectedMid, actualMid);
    }
}