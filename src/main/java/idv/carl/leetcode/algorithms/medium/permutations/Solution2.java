package idv.carl.leetcode.algorithms.medium.permutations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Carl Lu
 */
public class Solution2 {

    private static List<String> results = new ArrayList<>();

    public static void main(String[] args) {
        int[] input = new int[] {1, 2, 3};
        System.out.println("Initial input status: " + Arrays.toString(input));
        Solution2.permute(input, 0);
        System.out.println();
        System.out.println("\u001B[42m" + "Final results: ");
        results.forEach(System.out::println);
    }

    private static void permute(int[] input, int startPosition) {
        for (int currentPosition = startPosition; currentPosition < input.length; currentPosition++) {
            showTraceMessage(true, input, currentPosition, startPosition);
            swap(input, startPosition, currentPosition);
            permute(input, startPosition + 1);
            swap(input, startPosition, currentPosition);
        }

        if (startPosition == input.length) {
            String result = Arrays.toString(input);
            System.out.println("\u001B[33m" + "Add " + result + " to results:");
            results.add(result);
        }
    }

    private static void swap(int[] input, int firstIndex, int secondIndex) {
        int temp = input[firstIndex];
        input[firstIndex] = input[secondIndex];
        input[secondIndex] = temp;
    }

    private static void showTraceMessage(boolean show, int[] input, int currentPosition, int startPosition) {
        if (show) {
            String consoleColor;
            int consoleColorLevel = ( currentPosition % 3 ) + 1;
            switch (consoleColorLevel) {
                case 1:
                    consoleColor = "\u001B[32m";
                    break;
                case 2:
                    consoleColor = "\u001B[36m";
                    break;
                case 3:
                    consoleColor = "\u001B[35m";
                    break;
                default:
                    consoleColor = "\u001B[35m";
                    break;
            }
            System.out.println(consoleColor + "Inner input status: " + Arrays.toString(input));
            System.out.println(consoleColor + "currentPosition: " + currentPosition + " start: " + startPosition);
        }
    }

}
