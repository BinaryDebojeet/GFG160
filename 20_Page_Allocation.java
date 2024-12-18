class Solution {
    public static int findPages(int[] arr, int k) {
        int n = arr.length;

        if (k > n) return -1;

        int min = arr[0];
        int max = 0;
        for (int i = 0; i < n; i++) {
            min = Math.max(min, arr[i]);
            max += arr[i];
        }

        int ans = -1;

        while (min <= max) {
            int mid = (min + max) / 2;

            if (allocate(arr, k, mid)) {
                ans = mid;
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }

        return ans;
    }

    public static boolean allocate(int[] arr, int k, int maxPages) {
        int stu = 1;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (sum + arr[i] > maxPages) {
                stu++;
                sum = arr[i];
                if (stu > k) {
                    return false;
                }
            } else {
                sum += arr[i];
            }
        }

        return true;
    }
}
