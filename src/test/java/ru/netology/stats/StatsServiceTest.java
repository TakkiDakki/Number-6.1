package ru.netology.stats;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {

    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsService service = new StatsService();

    @Test
    void calculateSum() {

        int actual= service.sum(sales);

        int expected = 180;

        assertEquals(expected, actual);
    }



    @Test
    void shouldReturnMidle() {

        int actual = service.findMidle(sales);

        int expected = 15;

        assertEquals(expected, actual);
    }

    @Test
    void returnMaxValue() {

        int expected = 8;

        int actual = (int) service.maxValue(sales);

        assertEquals(expected, actual);
    }

    @Test
    void returnMinValue() {

        int expected = 9;

        int actual = (int) service.minValue(sales);

        assertEquals(expected, actual);
    }

    @Test
    void findBelowThanMidle() {

        int expected = 5;

        int actual = (int) service.BelowThanMidle(sales);

        assertEquals(expected, actual);
    }

    @Test
    void findAbovethanMidle() {

        int expected = 5;

        int actual = (int) service.AbovethanMidle(sales);

        assertEquals(expected, actual);
    }
}