import java.util.stream.IntStream;

// shared methods
public class Shared {
    public static final String[] days = {
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday",
            "Sunday"
    };
    public static final String[] months = {
            "January",
            "February",
            "March",
            "April",
            "May",
            "June",
            "July",
            "August",
            "September",
            "October",
            "November",
            "December"
    };

    public static final String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o",
            "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

    // Function to find the index of an element
    public static int findIndex(String arr[], String t)
    {
        int len = arr.length;
        return IntStream.range(0, len)
                .filter(i -> t.equals(arr[i]))
                .findFirst() // first occurrence
                .orElse(-1); // No element found
    }


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

    public static boolean isPalindromic(int n) {
        String s = Integer.toString(n);
        while (s.length() > 1) {
            String c1 = s.substring(0, 1);
            String c2 = s.substring(s.length() - 1);
            if (!c1.equals(c2)) {
                return false;
            }
            s = s.substring(1, s.length() - 1);
        }
        return true;
    }
}
