class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> lastSeen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // Check if we've seen this value within distance k
            if (lastSeen.containsKey(nums[i]) && i - lastSeen.get(nums[i]) <= k) {
                return true;
            }
            // Record or update the most recent index for this value
            lastSeen.put(nums[i], i);
        }
        return false;
    }
}