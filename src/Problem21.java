/*
Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable
numbers.

For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The
proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.

Evaluate the sum of all the amicable numbers under 10000.
 */

import java.util.ArrayList;

public class Problem21 {
    private ArrayList<Integer> numbersAdded = new ArrayList<Integer>();
    private int amicableSum = 0;

    public Problem21() {
        int n = 2;

        while (n < 10000) {
            // if it's already in numbersAdded, skip
            if (numbersAdded.contains(n)) {
                n += 1;
                continue;
            }
            // get the divisors sum, and get the divisors sum of the sum
            int divSum1 = getDivisorSum(n);
            int divSum2 = getDivisorSum(divSum1);

            // if they're equal, add them to amicableSum and arraylist
            if (divSum2 == n && divSum1 != n) {
                amicableSum += n + divSum1;
                numbersAdded.add(n);
                numbersAdded.add(divSum1);
            }

            n += 1;
        }

        System.out.println("Sum of amicable numbers: " + amicableSum);
    }

    private int getDivisorSum(int n) {
        switch(n) {
            case 1:
            case 2:
                return 1;
        }

        int sum = 0;

        for (int i = 1; i < n / 2 + 1; i++) {
            sum += (n % i == 0) ? i : 0;
        }

        return sum;
    }
}
