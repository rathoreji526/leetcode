class Solution {
    public int countCommas(int n) {
        int commas = 0;
        int start = 1000;
        int commaCount = 1;

        while (start <= n) {
            int end = start * 1000 - 1;
            int numbersInRange = Math.min(n, end) - start + 1;
            commas += numbersInRange * commaCount;

            start *= 1000;
            commaCount++;
        }

        return commas;
    }
}