class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        HashMap<Integer, Integer> pre = new HashMap<>();
        HashMap<Integer, Integer> suf = new HashMap<>();
        for (int num : nums) {
            suf.put(num, suf.getOrDefault(num, 0) + 1);
        }
        for (int i = 0; i < nums.length; i++) {
            pre.put(nums[i], pre.getOrDefault(nums[i], 0) + 1);
            suf.put(nums[i], suf.getOrDefault(nums[i], 0) - 1);
            if (suf.get(nums[i]) == 0) {
                suf.remove(nums[i]);
            }
            nums[i] = pre.size() - suf.size();
        }

        return nums;
    }
}