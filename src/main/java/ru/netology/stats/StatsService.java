package ru.netology.stats;


public class StatsService {
    public int sum(int[] items) {
        int sum = 0;
        for (int item : items) {

            sum += item;
        }
        return sum;
    }

    public int findMidle(int[] items) {
        int sum = sum(items);
        return sum / items.length;
    }


    public int maxValue(int[] items) {
        int currentMax = items[0];
        for (int item : items) {

            if (item > currentMax) {
                currentMax = item;
                       }
        }
            int monthCount = 0;
            int resultMonth = 0;
            for (int item : items) {
                monthCount++;
                if (item == currentMax) {
                    resultMonth = monthCount;
                }
            }

        return resultMonth;
    }

        public int minValue (int[] items) {
            int currentMin = items[0];
            for (int item : items) {
                if (item < currentMin) {
                    currentMin = item;
                }
            }
            int monthCount = 0;
            int resultMonth = 0;
            for (int item : items) {
                monthCount++;
                if (item == currentMin) {
                    resultMonth = monthCount;
                }
                return resultMonth;
            }
            return currentMin;
        }

    public int BelowThanMidle(int[] items) {
        int findMidle = findMidle(items);
        int monthCount = 0;
        for (int item : items) {
            if (item > findMidle) {
                monthCount++;

            }
        }
        return monthCount;
    }


    public int AbovethanMidle(int[] items) {
        int findMidle = findMidle(items);
        int monthCount = 0;
        for (int item : items) {
            if (item < findMidle) {
                monthCount++;

            }
        }
        return monthCount;
    }
    }
