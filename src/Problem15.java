import java.math.BigInteger;

/*
NOT WORKING

Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down,
there are exactly 6 routes to the bottom right corner.

How many such routes are there through a 20×20 grid?
*/
public class Problem15 {
    private final int GRIDSIZE = 10;

    public Problem15() {
        BigInteger result = getRoutes();
        System.out.println("Result: " + result.toString());
        System.out.println("solution(2): " + solution(2));
        System.out.println("solution(20): " + solution(20));
    }

    private BigInteger getRoutes() {
        int grid = GRIDSIZE * GRIDSIZE;
        BigInteger result = new BigInteger("1");
        for (int i = grid; i > 0; i--) {
            result = result.multiply(BigInteger.valueOf(i));
            System.out.println("Multiplying by " + BigInteger.valueOf(i));
        }
        for (int i = GRIDSIZE; i > 0; i--) {
            result = result.divide(BigInteger.valueOf(i));
            result = result.divide(BigInteger.valueOf(i));
            System.out.println("Dividing twice by " + BigInteger.valueOf(i));
        }
        return result;
    }

    private int solution(int n) {
        int c = 1;
        for (int i = 1; i <= n; i++) {
            c = c * (n + i) / i;
        }
        return c;
    }
}
