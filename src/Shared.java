// shared methods
public class Shared {

    public static boolean isPrime(int n) {
        if (n < 1) {
            return false;
        } else if (n < 4) {
            return true;
        } else if (n % 2 == 0) {
            return false;
        } else {
            for (int i = 3; i < n / 2; i ++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static boolean isPrime(long n) {
        if (n < 1) {
            return false;
        } else if (n < 4) {
            return true;
        } else if (n % 2 == 0) {
            return false;
        } else {
            for (long i = 3; i < n / 2; i += 2) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
