/*
If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 
3 + 3 + 5 + 4 + 4 = 19 letters used in total.

If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many 
letters would be used?

NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 
letters and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out 
numbers is in compliance with British usage.
 */

import java.util.Arrays;
import java.util.Collections;

public class Problem17 {
    String[] first = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    String[] tens = {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    String[] second = {"ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };
    
    public Problem17() {
        int totalLength = 0;
        for (int i = 1; i <= 1000; i++) {
            totalLength += convertToString(i).length();
        }
        System.out.println("total length: " + totalLength);
        //System.out.println(convertToString(342).length()); //23
        //System.out.println(convertToString(115).length()); //20
    }

    private String convertToString(int num) {
        String s = "";
        String[] strArr = Integer.toString(num).split("");
        Collections.reverse(Arrays.asList(strArr));
        if (strArr.length == 1 ) { //single digit
            return first[Integer.parseInt(strArr[0]) - 1];
        } else if (strArr.length >= 2) {
            int last = Integer.parseInt(strArr[0]);
            int secondLast = Integer.parseInt(strArr[1]);
            if (secondLast == 1) { //deal with 10-19
                if (last == 0) { s += "ten"; }
                else { s += tens[last - 1]; }
            } else if (secondLast != 0) { //deal with multiples of 10
                s += second[secondLast - 1];
                if (last != 0) {
                    s += first[last - 1];
                }
            } else if (last != 0) { //secondLast = 0
                s += first[last - 1];
            }
        }
        if (strArr.length > 2) {
            if (!s.equals("")) { s = "and" + s; } //only not true when last digits were 00
            int thirdLast = Integer.parseInt(strArr[2]);
            if (thirdLast != 0) { s = first[thirdLast - 1] + "hundred" + s; };
        }
        if (strArr.length > 3) {
            int fourthLast = Integer.parseInt(strArr[3]);
            s = first[fourthLast - 1] + "thousand" + s;
        }

        return s;
    }
    
}
