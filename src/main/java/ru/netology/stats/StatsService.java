package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long totalSale = 0;
        for ( long sale : sales) {
            totalSale += sale;
        }
        return  totalSale;
    }

    public long average(long[] sales) {
        return sum(sales) / 12;
    }

    public int calcMonthMaximumSale(long[] sales) {
        int monthMaximum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[monthMaximum] <= sales[i]) {
                monthMaximum = i;
            }
        }
        return monthMaximum + 1;
    }

    public int calcMonthMinimumSale(long[] sales) {
        int monthMinimum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[monthMinimum] >= sales[i]) {
                monthMinimum = i;
            }
        }
        return monthMinimum + 1;
    }

    public int calcMonthsBelowAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }

    public int calcMonthsAreAboveAverageSale(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;
    }
}
