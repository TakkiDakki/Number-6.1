package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @Test
    void calculateSum() {
        StatsService service = new StatsService();

        long[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual= service.calculateSum(months);

        assertEquals(expected, actual);
    }

    @Test
    void findMidle() {
        StatsService service = new StatsService();

        long[] midlesums = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 20;

        long actual = service.findMidle(midlesums);

        assertEquals(expected, actual);
    }

    @Test
    void maxValue() {
        StatsService service = new StatsService();

        long[] currentMax = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 6;

        long actual = service.findMidle(currentMax);

        assertEquals(expected, actual);
    }

    @Test
    void minValue() {
        StatsService service = new StatsService();

        long[] currentMin = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = service.findMidle(currentMin);

        assertEquals(expected, actual);
    }

    @Test
    void findBelowTheMidle() {
        StatsService service = new StatsService();

        long[] currentMidle = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 2;

        long actual = service.findMidle(currentMidle);

        assertEquals(expected, actual);
    }

    @Test
    void findAboveMidle() {
        StatsService service = new StatsService();

        long[] currentMidle = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 6;

        long actual = service.findMidle(currentMidle);

        assertEquals(expected, actual);
    }
}