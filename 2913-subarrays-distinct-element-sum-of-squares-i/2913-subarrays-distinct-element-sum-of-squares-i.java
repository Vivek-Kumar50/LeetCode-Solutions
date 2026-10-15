class Solution {
    public int sumCounts(List<Integer> nums) {
        int n = nums.size();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = i; j < n; j++) {
                if (!list.contains(nums.get(j))) {
                    list.add(nums.get(j));
                }

                int distinct = list.size();
                sum = sum + distinct * distinct;
            }
        }

        return sum;
    }
}
