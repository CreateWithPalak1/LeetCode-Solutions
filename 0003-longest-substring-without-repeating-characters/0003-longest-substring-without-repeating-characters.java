class Solution {
    public int lengthOfLongestSubstring(String s) {
        int arr[] = new int[128];
        int max = 0, j = 0;

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)]++;

            while (arr[s.charAt(i)] > 1) {
                arr[s.charAt(j++)]--;
            }

            max = Math.max(max, i - j + 1);
        }

        return max;
    }
}