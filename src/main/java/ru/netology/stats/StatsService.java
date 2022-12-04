package ru.netology.stats;

public class StatsService {

    public long sum(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;
        }
        return result;
    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        long maxMonth = sales[0];
        int month = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxMonth) {
                maxMonth = sales[i];
                month = i;
            }
        }
        return month;
    }

    public int minSales(long[] sales) {
        long minMonth = sales[0];
        int month = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minMonth) {
                minMonth = sales[i];
                month = i;
            }
        }
        return month;
    }

    public int minAverage(long[] sales) {
        long averageSales = average(sales);
        int month = 0;
        for (long sale : sales) {
            if (sale < averageSales) {
                month++;
            }
        }
        return month;
    }

    public int maxAverage(long[] sales) {
        long averageSales = average(sales);
        int month = 0;
        for (long sale : sales) {
            if (sale > averageSales) {
                month++;
            }
        }
        return month;
    }
}
