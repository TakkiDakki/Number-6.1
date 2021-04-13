package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] months) {
        long sum = 0; // начинаем с нуля
        for (long month : months) {
            // аналог sum = sum + purchase;
            sum += month;
        }
        return sum;
    }

    public long findMidle(long[] midlesums) {
        long currentMidle = midlesums[0];
        for (long midlesum : midlesums) {
            if (currentMidle == midlesum) {
                currentMidle = midlesum;
            }
        }
        return currentMidle;
    }

    public int maxValue(int[] values) {
        int currentMax = values[0]; // берём за точку отсчёта первый
        for (int value : values) {
            // на каждой итерации прибавляем единицу
            // таким образом для первого значения month = 1
            if (currentMax > value) {
                currentMax = value;
            }
          }
        return currentMax;
    }

        public int minValue (int[] values){
            int currentMin = values[0]; // берём за точку отсчёта первый
            for (int value : values) {
                // на каждой итерации прибавляем единицу
                // таким образом для первого значения month = 1
                if (currentMin < value) {
                    currentMin = value;
                }
                 }
            return currentMin;
        }

    public long findBelowTheMidle(long[] midlesums) {
        long currentMidle = midlesums[0]; // берём за точку отсчёта первый
        for (long midlesum : midlesums) {
            if (currentMidle < midlesum) {
                currentMidle = midlesum;
            }
        }
        return currentMidle;
    }
    public long findAboveMidle(long[] midlesums) {
        long currentMidle = midlesums[0]; // берём за точку отсчёта первый
        for (long midlesum : midlesums) {
            if (currentMidle < midlesum) {
                currentMidle = midlesum;
            }
        }
        return currentMidle;
    }
    }