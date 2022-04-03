/*
Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names,
begin by sorting it into alphabetical order. Then working out the alphabetical value for each name, multiply this value
by its alphabetical position in the list to obtain a name score.

For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the
938th name in the list. So, COLIN would obtain a score of 938 × 53 = 49714.

What is the total of all the name scores in the file?
 */

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem22 {
    private ArrayList<String> fileContent = new ArrayList<>();

    public Problem22() {
        addContentToArrayList();
        Collections.sort(fileContent);
        int result = getAllNameScores();

        System.out.println("Name score total: " + result);
    }

    private void addContentToArrayList() {
        try {
            String filePath = new File("").getAbsolutePath();

            Scanner sc = new Scanner(new File(filePath.concat("/src/data/p022_names.txt")));

            while(sc.hasNextLine()){
                String str = sc.nextLine();
                String[] names = str.split(",");
                for (int i = 0; i < names.length; i++) {
                    fileContent.add(names[i].substring(1, names[i].length() - 1));
                }

            }
        } catch(Exception e) {
            System.out.println("Names file not found. " + e);
        }
    }

    private int getNameScore(String name) {
        int total = 0;

        String[] letters = name.split("");
        for (int i = 0; i < letters.length; i++) {
            total += Shared.findIndex(Shared.alphabet, letters[i].toLowerCase()) + 1;
        }

        total *= (Shared.findIndex(fileContent.toArray(new String[fileContent.size()]), name) + 1);

        return total;
    }

    private int getAllNameScores() {
        return fileContent.stream().mapToInt(name -> getNameScore(name)).sum();
    }
}
