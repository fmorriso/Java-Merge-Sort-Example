import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static final MergeSort ob = new MergeSort();

    // Driver method
    public static void main(String[] args) {
        final int NUM_EXAMPLES = 5;
        for (int i = 1; i <= NUM_EXAMPLES; i++)
            runExample(i);
    }

    private static void runExample(int i) {
        int size = RandomNumberUtilities.getRandomIntInRange(5, 20);
        int min = RandomNumberUtilities.getRandomIntInRange(-1000, 1000);
        int max = RandomNumberUtilities.getRandomIntInRange(min, 2000);

        System.out.format("%d. size: %d, min: %d, max: %d%n", i, size, min, max);

        int[] nums = generateRandomIntArray(size, min, max);
        System.out.println(Arrays.toString(nums));
        ob.sort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
        System.out.println();

    }

    private static int[] generateRandomIntArray(int size, int min, int max) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = RandomNumberUtilities.getRandomIntInRange(min, max);
        }
        return arr;
    }
}