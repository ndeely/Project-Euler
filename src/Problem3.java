/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
 */

import java.math.BigInteger;

public class Problem3 {
    //final long NUM = 13195;
    final long NUM = 600851475143L;

    public Problem3() {
        System.out.println("Largest Prime Factor: " + getLargestPrimeFactor(NUM));
    }

    private long getLargestPrimeFactor(long n) {
        if (Shared.isPrime(n)) {
            return n;
        } else {
            for (long i = 2; i < n / 2 + 1; i++) {
                if (n % i == 0 && Shared.isPrime(n / i)) {
                    return n / i;
                }
            }
        }
        return 1;
    }
}
