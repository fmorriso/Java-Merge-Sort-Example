import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static final MergeSort ob = new MergeSort();

    // Driver method
    public static void main(String[] args) {
        KeyValueSettingsUtilities.setFileName("settings.txt");

        int numExamples = getNumExamples();

        int minSize = getMinSize();
        int maxSize = getMaxSize();

        int minValue = getMinValue();
        int maxValue = getMaxValue();

        for (int i = 1; i <= numExamples; i++)
            runExample(i, minSize, maxSize, minValue, maxValue);
    }

    private static int getMaxValue() {
        int n;
        try {
            n = Integer.parseInt( KeyValueSettingsUtilities.getValue("MAX_VALUE") );
        } catch (Exception e) {
            n = 500;
        }
        return n;
    }

    private static int getMinValue() {
        int n;
        try {
            n = Integer.parseInt( KeyValueSettingsUtilities.getValue("MIN_VALUE") );
        } catch (Exception e) {
            n = -500;
        }
        return n;
    }

    private static int getMinSize() {
        int minSize;
        try {
            minSize = Integer.parseInt( KeyValueSettingsUtilities.getValue("MIN_SIZE") );
        } catch (Exception e) {
            minSize = 5;
        }
        return minSize;
    }

    private static int getMaxSize() {
        int maxSize;
        try {
            maxSize = Integer.parseInt( KeyValueSettingsUtilities.getValue("MAX_SIZE") );
        } catch (Exception e) {
            maxSize = 20;
        }
        return maxSize;
    }

    private static int getNumExamples() {
        int numExamples;
        try {
            numExamples = Integer.parseInt( KeyValueSettingsUtilities.getValue("NUM_EXAMPLES") );
        } catch (Exception e) {
            numExamples = 1;
        }
        return numExamples;
    }

    private static void runExample(int i, int minSize, int maxSize, int minValue, int maxValue) {
        int size = RandomNumberUtilities.getRandomIntInRange(minSize, maxSize);
        int min = RandomNumberUtilities.getRandomIntInRange(minValue, maxValue);
        int max = RandomNumberUtilities.getRandomIntInRange(min, min + (2 * Math.abs(min)));

        System.out.format("%d. size: %d, min: %d, max: %d%n", i, size, min, max);

        int[] nums = generateRandomIntArray(size, min, max);
        System.out.format("before: %s%n",Arrays.toString(nums));
        ob.sort(nums, 0, nums.length - 1);
        System.out.format("after : %s%n",Arrays.toString(nums));
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