public class SalesTracker {
    public static void main(String[] args) {
        int weekendCount = 0, weekendSum = 0;
        int[] sales = {
                100, // Day 0 (Mon)
                120, // Day 1 ↑ increase
                110, // Day 2 ↓ loss
                90, // Day 3 ↓ loss (continuous loss starts)
                95, // Day 4 ↑ small recovery
                200, // Day 5 (Sat) ↑ BIG increase (max increase)
                180, // Day 6 (Sun) ↓ loss
                170, // Day 7 ↓ loss (continuous loss again)
                160, // Day 8 ↓ loss
                165, // Day 9 ↑
                180, // Day 10 ↑
                175, // Day 11 ↓
                190, // Day 12 ↑
                210, // Day 13 ↑
                205 // Day 14 ↓
        };
        int diff, maxDiff = Integer.MIN_VALUE, maxIncDay = 0;
        int currentlossStreak = 0, maxlossStreakDays = 0;

        for (int i = 0; i < sales.length; i++) {
            if (i > 0 && sales[i - 1] < sales[i]) {
                diff = sales[i] - sales[i - 1];
                if (diff > maxDiff) {
                    maxDiff = diff;
                    maxIncDay = i;
                }
            }

            if (i % 7 == 5 || i % 7 == 6) {
                weekendSum += sales[i];
                weekendCount++;
            }

            if (i < sales.length - 1 && sales[i ] > sales[i+1]) {
                currentlossStreak++;
                if (currentlossStreak > maxlossStreakDays) {
                    maxlossStreakDays = currentlossStreak;
                }

            } else {
                currentlossStreak = 0;
            }

        }
        System.out.println("highest sales increment day :" + maxIncDay + " having increment of " + sales[maxIncDay]);
        System.out.println("Average weekend sales = " + weekendSum / weekendCount);
        System.out.println("Countinous loss period for about "
                + maxlossStreakDays + " days");
    }
}
