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
    void minValue() {

        int expected = 9;

        int actual = (int) service.findMidle(sales);

        assertEquals(expected, actual);
    }

    @Test
    void findBelowTheMidle() {

        int expected = 5;

        int actual = (int) service.findMidle(sales);

        assertEquals(expected, actual);
    }

    @Test
    void findAboveMidle() {

        int expected = 5;

        int actual = (int) service.findMidle(sales);

        assertEquals(expected, actual);
    }
}