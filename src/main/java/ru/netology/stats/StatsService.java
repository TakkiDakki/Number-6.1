package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] months) {
        int sum = 0; // начинаем с нуля
        for (int month : months) {
            // аналог sum = sum + purchase;
            sum += month;
        }
        return sum;
    }

    public int findMidle(int[] months) {
        int currentMidle = 0;
        for (int midlesum : months) {
            currentMidle += midlesum;

        }
        return currentMidle / months.length;
    }

    public int maxValue(int[] values) {
        int currentMax = 0;
        int value = values[0];
        for (int i = 0; i < values.length; i++) {

            if (value <= values[i]) {
                value = values[i];
                currentMax = i;
            }
          }
        return currentMax + 1;
    }

        public int minValue (int[] months){
            int currentMin = months[0];
            for (int value : months) {

                if (currentMin <= value) {
                    currentMin = value;
                }
                 }
            return currentMin;
        }

    public int findBelowTheMidle(int[] months) {
        double midle = findMidle(months);
        int monthsBelowTheMidle = 0;
        for (int midlesum : months) {
            if (monthsBelowTheMidle < midle) {
                monthsBelowTheMidle++;
            }
        }
        return monthsBelowTheMidle;
    }
    public int findAboveMidle(int[] months) {
        int midle = findMidle(months);
        int monthsAboveMidle = 0;
        for (int midlesum : months) {
            if (midlesum > midle) {
                monthsAboveMidle++;
            }
        }
        return monthsAboveMidle;
    }
    }
