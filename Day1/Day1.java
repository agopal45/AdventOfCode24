import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.util.PriorityQueue;

/**
 * The idea of this problem is that we are given two separate lists and we want to find the
 * total distance between the lists. i.e. the total distance is the sum of the distance between
 * the ith largest item in each of the lists.
 *
 * My idea to solve this problem was to create a priority queue for each list and dequeue from
 * each priority queue to get the ith largest item for both. Then I found the absolute distance
 * between these two values and added that to a total sum.
 *
 * Final answer for my given input: 1110981
 */
public class Day1 {
    public static void main (String[] args) throws FileNotFoundException {
        File file = new File("/Users/akhilgopal/Library/CloudStorage/OneDrive-GeorgiaInstituteofTechnology/cs1332/AdventOfCode24d1/src/Day1Input.txt");
        System.out.println(file.exists());
        Scanner scan = new Scanner(file);
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();
        int totalDistance = 0;
        while (scan.hasNext()) {
            pq1.add(scan.nextInt());
            pq2.add(scan.nextInt());
        }
        while (!pq1.isEmpty()) {
            int num1 = pq1.poll();
            int num2 = pq2.poll();
            totalDistance += Math.abs(num2 - num1);
        }
        System.out.println(totalDistance);
    }
}
