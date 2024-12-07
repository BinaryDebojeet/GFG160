class Solution {
    // Function to count inversions in the array.
    static int inversionCount(int arr[]) {
        int[] temp = new int[arr.length];
        return mergeSortAndCount(arr, temp, 0, arr.length - 1);
    }

    private static int mergeSortAndCount(int[] arr, int[] temp, int left, int right) {
        int count = 0;
        if (left < right) {
            int mid = (left + right) / 2;

            count += mergeSortAndCount(arr, temp, left, mid);
            count += mergeSortAndCount(arr, temp, mid + 1, right);

            count += mergeAndCount(arr, temp, left, mid, right);
        }
        return count;
    }

    private static int mergeAndCount(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = left;
        int swaps = 0;

        // Merging the two halves while counting inversions.
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                swaps += (mid - i + 1);
            }
        }

        // Copy remaining elements of the left half, if any.
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements of the right half, if any.
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // Copy the merged elements back into the original array.
        for (i = left; i <= right; i++) {
            arr[i] = temp[i];
        }

        return swaps;
    }
}
