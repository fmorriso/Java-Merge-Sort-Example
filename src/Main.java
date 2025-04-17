import java.util.Arrays;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // Driver method
    public static void main(String[] args) {
        int[] unsortedNums = {12, 11, 13, 5, 6, 7};

        // Calling of Merge Sort
        MergeSort ob = new MergeSort();
        ob.sort(unsortedNums, 0, unsortedNums.length - 1);

        for (int j : unsortedNums) System.out.print(j + " ");
        System.out.println();

        unsortedNums = generateRandomIntArray(11, -1000,1000);
        System.out.println(Arrays.toString(unsortedNums));
        ob.sort(unsortedNums, 0, unsortedNums.length - 1);
        System.out.println(Arrays.toString(unsortedNums));
    }

    private static int[] generateRandomIntArray(int size, int min, int max) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = RandomNumberUtilities.getRandomIntInRange(min, max);
        }
        return arr;
    }
}