class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0;
        int ans = 0;
        int types = 0;
        int[] freq = new int[fruits.length];
        for (int right = 0; right < fruits.length; right++) {
            if (freq[fruits[right]] == 0) {
                types++;
            }
            freq[fruits[right]]++;
            while (types > 2) {
                freq[fruits[left]]--;
                if (freq[fruits[left]] == 0) {
                    types--;
                }
                left++;
            }
            int length = right - left + 1;
            if (length > ans) {
                ans = length;
            }
        }

        return ans;
    }
}