/*
The sum of the squares of the first ten natural numbers is 385. 1^2 + 2^2 ...

The square of the sum of the first ten natural numbers is 3025. (1 + 2 + 3...) ^ 2

Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is
3025 - 385 = 2640
.
Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */

public class Problem6 {
    private final int TOPNUM = 100;
    private int addSum = 0;
    private int squareSum = 0;

    public Problem6() {
        for (int i = 1; i <= TOPNUM; i++) {
            addSum += i;
            squareSum += (i * i);
        }
        addSum *= addSum;
        int result = addSum - squareSum;

        System.out.println("Difference: " + result);
    }
}
