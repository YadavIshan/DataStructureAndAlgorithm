package Array.Two_Pointers;
public class RemoveDuplicatesII {
    public static void main(String[] args) {
        RemoveDuplicatesII solution = new RemoveDuplicatesII();

        // Test Case 1
        int[] nums1 = { 1, 1, 1, 2, 2, 3 };
        System.out.print("Input: {1, 1, 1, 2, 2, 3} -> Expected Length: 5, Output: ");
        int len1 = solution.removeDuplicates(nums1);
        printResult(nums1, len1);

        // Test Case 2
        int[] nums2 = { 0, 0, 1, 1, 1, 1, 2, 3, 3 };
        System.out.print("Input: {0, 0, 1, 1, 1, 1, 2, 3, 3} -> Expected Length: 7, Output: ");
        int len2 = solution.removeDuplicates(nums2);
        printResult(nums2, len2);
    }

    private static void printResult(int[] nums, int len) {
        System.out.print("[");
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i] + (i < len - 1 ? ", " : ""));
        }
        System.out.println("]");
    }

    // REFINED USER APPROACH (Frequency Counter)
    // You wanted to "refine" your logic (using freq/prev) rather than rewrite it.
    // Here is the correct version of your intuition.
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;

        int writer = 1; // "mid" in your code. Start at 1 because nums[0] is always kept.
        int prev = nums[0]; // Track current number
        int frequency = 1; // Count of current number

        // Reader (start) begins at 1
        for (int start = 1; start < nums.length; start++) {
            if (nums[start] == prev) {
                frequency++;
            } else {
                // New number found! Reset count.
                frequency = 1;
                prev = nums[start];
            }

            // The Core Decision:
            // "If the count is 1 or 2, we want to KEEP this number."
            // So we write it to our 'writer' position.
            if (frequency <= 2) {
                nums[writer] = nums[start];
                writer++;
            }
        }

        System.out.println("Returned writer: " + writer);
        return writer;
    }
}
