class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> indices = new HashMap<>();

        for(int i =0;i<nums.length;i++){
            int r = target - nums[i];
            if(indices.containsKey(r)){
                return new int[]{indices.get(r), i};
            }
            indices.put(nums[i],i);
        }
        return null;
    }
}
