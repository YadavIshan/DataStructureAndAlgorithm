package Array.Two_Pointers;

public class LongestRepeatingCharacterK {
    // Brute Force
    public int longestRepeatingCharacterK(String s, int k) {
        int ans = 0;
        for (int start = 0; start < s.length(); start++) {
            int[] freq = new int[26];
            int maxFreq = 0;
            for (int end = start; end < s.length(); end++) {
                int charIndex = s.charAt(end) - 'A';
                freq[charIndex]++;
                maxFreq = Math.max(maxFreq, freq[charIndex]);

                int currentLength = end - start + 1;
                if (currentLength - maxFreq <= k) {
                    ans = Math.max(ans, currentLength);
                }
            }
        }
        return ans;
    }

    // Optimal Approach
    public int longestRepeatingCharacterKOptimal(String s, int k) {
        int ans = 0 , start = 0 , end = 0 ;

        while(end < s.length()){
            if()
            end++;
        }

        return ans;
    }

    public static void main(String[] args) {
        LongestRepeatingCharacterK solution = new LongestRepeatingCharacterK();
        String s = "AABABBA";
        int k = 1;
        System.out.println("Longest Repeating Character K: " + solution.longestRepeatingCharacterK(s, k));
    }
}
