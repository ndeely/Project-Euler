/*
COLLATZ SEQUENCE:

The following iterative sequence is defined for the set of positive integers:
n → n/2 (n is even)
n → 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:
13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1

It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms.
Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.
*/

public class Problem14 {
    public Problem14() {
        int topNum = 0;
        int topChain = 0;
        for (int i = 0; i <= 1000000; i++) {
            int chainLength = getChainLength(i);
            if (chainLength > topChain) {
                topChain = chainLength;
                topNum = i;
                System.out.println("Top Number: " + topNum);
                System.out.println("Top Chain Length: " + topChain);
            }
        }
        System.out.println("Top Number: " + topNum);
        System.out.println("Top Chain Length: " + topChain);
    }

    private int getChainLength(int n) {
        if (n < 1) {
            return 0;
        }
        int chainLength = 1;
        long chainLink = n;
        while (chainLink != 1) {
            if (chainLink % 2 == 0) {
                chainLink /= 2;
            } else {
                chainLink = (3 * chainLink) + 1;
            }
            chainLength++;
//            System.out.println("Chain item " + chainLength + ": " + chainLink);
            if (chainLink < 1) {
                System.out.println("An error occurred.");
                return chainLength;
            }
        }
        return chainLength;
    }
}
