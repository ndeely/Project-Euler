/*
Starting with the number 1 and moving to the right in a clockwise direction a 5 by 5 spiral is formed as follows:
21 22 23 24 25
20  7  8  9 10
19  6  1  2 11
18  5  4  3 12
17 16 15 14 13
It can be verified that the sum of the numbers on the diagonals is 101.
What is the sum of the numbers on the diagonals in a 1001 by 1001 spiral formed in the same way?
 */

public class Problem28 {
    public Problem28() {
        int result = sumDiagonals(1001);
        System.out.println("Sum: " + result);
    }

    private int sumDiagonals(int gridsize) {
        int n = (gridsize / 2) + 1;
        int result = 1;
        int currentNum = 1;
        int addition = 0;
        if (n > 1) {
            for (int count = 2; count <= n; count++) {
                addition += 2;
                for (int j = 0; j < 4; j++) {
                    currentNum += addition;
                    result += currentNum;
                }
            }
        }
        return result;
    }
}
