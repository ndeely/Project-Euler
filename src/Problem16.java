
/*
2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 2^1000?
*/

import java.math.BigInteger;

public class Problem16 {
    private final int POWER = 1000;
    private int sum = 0;

    public Problem16() {
        BigInteger n = new BigInteger("2").pow(POWER);
        String[] nAsStringArr = n.toString().split("");
        for (String s: nAsStringArr) {
            sum += Integer.parseInt(s);
        }
        System.out.println("Sum: " + sum);
    }
}
