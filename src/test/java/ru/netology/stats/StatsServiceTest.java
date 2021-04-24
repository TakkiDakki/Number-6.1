package ru.netology.stats;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {
    @Test
    void calculateSum() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 180;

        int actual= service.calculateSum(sales);

        assertEquals(expected, actual);
    }



    @Test
    void findMidle() {
        StatsService service = new StatsService();

        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.findMidle(months);

        assertEquals(expected, actual);
    }

    @Test
    void maxValue() {
        StatsService service = new StatsService();

        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = (int) service.findMidle(months);

        assertEquals(expected, actual);
    }

    @Test
    void minValue() {
        StatsService service = new StatsService();

        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = (int) service.findMidle(months);

        assertEquals(expected, actual);
    }

    @Test
    void findBelowTheMidle() {
        StatsService service = new StatsService();

        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = (int) service.findMidle(months);

        assertEquals(expected, actual);
    }

    @Test
    void findAboveMidle() {
        StatsService service = new StatsService();

        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = (int) service.findMidle(months);

        assertEquals(expected, actual);
    }
}