class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {

        Arrays.sort(reservedSeats, (a, b) -> {
            if (a[0] == b[0]) return a[1] - b[1];
            return a[0] - b[0];
        });

        int total = 2 * n;
        int i = 0;

        while (i < reservedSeats.length) {

            int row = reservedSeats[i][0];

            boolean left = true;
            boolean mid = true;
            boolean right = true;

            while (i < reservedSeats.length &&
                   reservedSeats[i][0] == row) {

                int seat = reservedSeats[i][1];

                if (seat >= 2 && seat <= 5)
                    left = false;

                if (seat >= 4 && seat <= 7)
                    mid = false;

                if (seat >= 6 && seat <= 9)
                    right = false;

                i++;
            }

            if (left && right) {
                // 2 families
            } 
            else if (left || mid || right) {
                total--;
            } 
            else {
                total -= 2;
            }
        }

        return total;
    }
}