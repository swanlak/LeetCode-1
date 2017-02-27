package idv.carl.sorting.bubblesort;

/**
 * @author Carl Lu
 */
public class BubbleSort {

    private static void swap(int[] input, int i, int j) {
        int tmp = input[i];
        input[i] = input[j];
        input[j] = tmp;
    }

    public static int[] sortDesc(int[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = 0; j < input.length - 1 - i; j++) {
                if (input[j] < input[j + 1]) {
                    swap(input, j, j + 1);
                }
            }
        }
        return input;
    }

    public static int[] sortAsc(int[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = 0; j < input.length - 1 - i; j++) {
                if (input[j] > input[j + 1]) {
                    swap(input, j, j + 1);
                }
            }
        }
        return input;
    }
}
