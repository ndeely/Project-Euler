/*
NOT WORKING

n! means n × (n − 1) × ... × 3 × 2 × 1

For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

Find the sum of the digits in the number 100!
*/

import java.math.BigInteger;

public class Problem20 {
    public Problem20() {
        String s = factorial(100).toString();
        int result = sumDigits(s);
        System.out.println("Result: " + result);
    }

    private BigInteger factorial(int n) {
        BigInteger result = new BigInteger("1");
        for (int i = n; i > 0; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    private int sumDigits(String s) {
        String[] digits = s.split("");
        int total = 0;
        for (String str: digits) {
            total += Integer.valueOf(str);
        }
        return total;
    }
}
