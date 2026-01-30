package Array.Two_Pointers;

public class LongestMountain {
        public int longestMountain(int[] arr) {
        int n = arr.length;
        if (n < 3) return 0;
        int longest = 0;
        
        for (int i = 1; i < n - 1; i++) {
            // Check if arr[i] is a peak
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                int left = i - 1;
                int right = i + 1;
                
                // Expand leftwards
                while (left > 0 && arr[left] > arr[left - 1]) {
                    left--;
                }
                
                // Expand rightwards
                while (right < n - 1 && arr[right] > arr[right + 1]) {
                    right++;
                }
                
                longest = Math.max(longest, right - left + 1);
            }
        }
        return longest;
    }

    // For testing purposes
    public static void main(String[] args) {
        LongestMountain sol = new LongestMountain();
        int[] arr1 = {2,1,4,7,3,2,5};
        int[] arr2 = {2,2,2};
        int[] arr3 = {0,1,2,3,4,5,4,3,2,1,0};

        System.out.println(sol.longestMountain(arr1)); // Expected output 5
        System.out.println(sol.longestMountain(arr2)); // Expected output 0
        System.out.println(sol.longestMountain(arr3)); // Expected output 11
    }
}
