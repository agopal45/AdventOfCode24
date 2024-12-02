import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Calculating a similarity score : "Calculate a total similarity score by adding up each number in the left list
 * after multiplying it by the number of times that number appears in the right list."
 * To keep track of the number or repeats in the right list, I used a hash map with each integer and the number of
 * times it is repeated.
 * I iteratively calculated the similarity score by accessing the value associated with each value in the left list.
 *
 * Final answer for my given input: 24869388
 */
public class Day1Bonus {
    public static void main (String[] args) throws FileNotFoundException {
        File file = new File("/Users/akhilgopal/Library/CloudStorage/OneDrive-GeorgiaInstituteofTechnology/cs1332/AdventOfCode24d1/src/Day1Input.txt");
        System.out.println(file.exists());
        Scanner scan = new Scanner(file);
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int similarityScore = 0;
        while (scan.hasNext()) {
            int left = scan.nextInt();
            int right = scan.nextInt();
            list.add(left);
            map.put(right, map.getOrDefault(right, 0) + 1);
        }
        for (Integer i : list) {
            similarityScore += i * map.getOrDefault(i, 0);
        }
        System.out.println(similarityScore);
    }
}
