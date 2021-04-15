/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit
numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class Problem4 {
    private int largest = 0;
    private final int TOP = 999;

    public Problem4() {
        for (int i = TOP; i > 0; i--) {
            for (int j = TOP; j > 0; j--) {
                if (largest > i * j) {
                    continue;
                } else if (Shared.isPalindromic(i * j) && (i * j) > largest) {
                    largest = i * j;
                }
            }
        }
        System.out.println("Largest Palindromic Number: " + largest);
    }
}
