/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

public class Problem5 {
    private final int TOPDIV = 20;
    private int currentNum = TOPDIV;

    public Problem5() {
        boolean isDivisible = false;
        while (!isDivisible) {
            currentNum += TOPDIV;
            for (int i = 1; i <= TOPDIV; i++) {
                if (currentNum % i != 0) {
                    break;
                } else if (i == TOPDIV && currentNum % i == 0) {
                    isDivisible = true;
                }
            }
        }
        System.out.println("Min Number divisible by 1 to " + TOPDIV + ": " + currentNum);
    }
}
