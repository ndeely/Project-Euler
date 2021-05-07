import java.math.BigInteger;

/*
Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down,
there are exactly 6 routes to the bottom right corner.

How many such routes are there through a 20×20 grid?
*/
public class Problem15 {
    private final int GRIDSIZE = 20;
    public Problem15() {
        BigInteger n = BigInteger.valueOf(GRIDSIZE * 2);      // The total number of moves for a path
        BigInteger r = BigInteger.valueOf(GRIDSIZE);      // The total number of right moves for a path

        // choose r from n:  n! / ( r! * (n-r)! )
        System.out.println(factorial(n).divide(factorial(r).multiply(factorial(n.subtract(r)))));
    }

    public static BigInteger factorial( BigInteger n ) {
        if (n.compareTo(BigInteger.ZERO) <= 0) {
            return BigInteger.ONE;
        } else {
            return (n.multiply(factorial(n.subtract(BigInteger.ONE))));
        }
    }
}
