class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            // Skip duplicate values for the first element
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int target = -nums[i];
            Set<Integer> seen = new HashSet<>();

            for (int j = i + 1; j < n; j++) {
                int complement = target - nums[j];

                if (seen.contains(complement)) {
                    result.add(Arrays.asList(nums[i], complement, nums[j]));
                    // Skip duplicates for the third element
                    while (j + 1 < n && nums[j] == nums[j + 1]) j++;
                }
                seen.add(nums[j]);
            }
        }

        return result;
    }
}