// Java program for Merge Sort

public class MergeSort {

    // Merges two subarrays of nums[]
    public void merge(int[] nums, int leftIndex, int middleIndex, int rightIndex) {

        int leftHalfSize = middleIndex - leftIndex + 1;
        int rightHalfSize = rightIndex - middleIndex;

        int[] leftHalf = new int[leftHalfSize];
        int[] rightHalf = new int[rightHalfSize];

        // create a separate left half of the array
        for (int i = 0; i < leftHalfSize; ++i)
            leftHalf[i] = nums[leftIndex + i];

        // create a separate right half of the array
        for (int i = 0; i < rightHalfSize; ++i)
            rightHalf[i] = nums[middleIndex + 1 + i];

        // Merge the temp arrays
        // Initial indexes of left and right subarrays
        int leftHalfIndex = 0, rightHalfIndex = 0;

        int idx = leftIndex;
        while (leftHalfIndex < leftHalfSize && rightHalfIndex < rightHalfSize) {
            if (leftHalf[leftHalfIndex] <= rightHalf[rightHalfIndex])
                nums[idx++] = leftHalf[leftHalfIndex++];
            else
                nums[idx++] = rightHalf[rightHalfIndex++];
        }

        // if we haven't looked at all of the left half numbers,
        // grab them now
        while (leftHalfIndex < leftHalfSize) {
            nums[idx++] = leftHalf[leftHalfIndex++];
        }

        // if we haven't looked at all of the right half numbers,
        // grab them now
        while (rightHalfIndex < rightHalfSize) {
            nums[idx++] = rightHalf[rightHalfIndex++];
        }
    }

    // Main function that sorts nums[leftIndex..rightIndex] using
    // merge()
    public void sort(int[] nums, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {

            int middleIndex = (leftIndex + rightIndex) / 2;

            // Sort first and second halves
            sort(nums, leftIndex, middleIndex);
            sort(nums, middleIndex + 1, rightIndex);

            // Merge the sorted halves
            merge(nums, leftIndex, middleIndex, rightIndex);
        }
    }


}
