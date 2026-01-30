package Array.Two_Pointers;

public class MinimumWindowSort {
    public static int minimumWindowSort(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;

        
        while (left < n - 1 && arr[left] <= arr[left + 1]) {
            left++;
        }
        if (left == n - 1) { 
            return 0;
        }

        
        while (right > 0 && arr[right] >= arr[right - 1]) {
            right--;
        }

        
        int subMin = Integer.MAX_VALUE;
        int subMax = Integer.MIN_VALUE;
        for (int i = left; i <= right; i++) {
            subMin = Math.min(subMin, arr[i]);
            subMax = Math.max(subMax, arr[i]);
        }

        
        while (left > 0 && arr[left - 1] > subMin) {
            left--;
        }
        
        while (right < n - 1 && arr[right + 1] < subMax) {
            right++;
        }

        return right - left + 1;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 6, 4, 8, 10, 9, 15};
        int[] arr2 = {1, 2, 3, 4};
        int[] arr3 = {1, 3, 2, 2, 2};

        System.out.println(minimumWindowSort(arr1)); // Output: 5
        System.out.println(minimumWindowSort(arr2)); // Output: 0
        System.out.println(minimumWindowSort(arr3)); // Output: 4
    }
}
