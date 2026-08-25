class Solution {
    public int missingMultiple(int[] nums, int k) {
        int multiple = k;
        while (true) {
            int found = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == multiple) {
                    found = 1;
                    break;
                }
            }
            if (found == 0) {
                return multiple;
            }
            multiple = multiple + k;
        }
    }
}