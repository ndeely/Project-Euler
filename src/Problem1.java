/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
*/

public class Problem1 {
    final int NUM = 1000;

    public Problem1() {
        System.out.println("Total for " + NUM + ": " + calcSum(NUM));
    }

    //calculate sum of natural numbers < n divisible by 3 or 5
    public int calcSum(int n) {
        int total = 0;
        for (int i = 0; i < n; i ++) {
            if (i % 3 == 0 || i % 5 == 0) {
                total += i;
            }
        }
        return total;
    }
}
