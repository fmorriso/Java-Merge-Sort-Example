import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // Driver method
    public static void main(String[] args) {
        int[] nums = {12, 11, 13, 5, 6, 7};

        // Calling of Merge Sort
        MergeSort ob = new MergeSort();

        System.out.println(Arrays.toString(nums));
        ob.sort(nums, 0, nums.length - 1);

        System.out.println(Arrays.toString(nums));
        System.out.println();

        nums = generateRandomIntArray(11, -1000, 1000);
        System.out.println(Arrays.toString(nums));
        ob.sort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));

        System.out.println();

        nums = generateRandomIntArray(23, -5000, 5000);
        System.out.println(Arrays.toString(nums));
        ob.sort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    private static int[] generateRandomIntArray(int size, int min, int max) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = RandomNumberUtilities.getRandomIntInRange(min, max);
        }
        return arr;
    }
}