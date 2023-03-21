// By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
// What is the 10 001st prime number?

public class Problem7 {
    private int count = 0;
    private int num = 0;

    public Problem7() {
        while (count < 10002) {
            num++;

            if (Shared.isPrime(num)) {
                count++;
            }
        }

        System.out.println("Prime " + (count - 1) + " is " + num + ".");
    }
}
