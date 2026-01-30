package Array.Two_Pointers;

public class LongestSubarrayWithAtmostKOddNumbers {
    int longestSubarrayWithAtmostKOddNumbers(int[] arr, int k) {
    int ans = 0, start = 0;
    int count = 0;

    for (int end = 0; end < arr.length; end++) {

        if (arr[end] % 2 != 0) {
            count++;
        }

        while (count > k) {   
            if (arr[start] % 2 != 0) {
                count--;
            }
            start++;
        }

        ans = Math.max(ans, end - start + 1);
    }

    return ans;
}

}
