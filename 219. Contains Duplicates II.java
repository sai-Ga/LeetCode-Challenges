class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> visited = new HashSet<>();
        for (int i = 0;i<nums.length;i++){
            if(visited.contains(nums[i])) return true;
            visited.add(nums[i]);
            if(visited.size()>k){
                visited.remove(nums[i-k]);
            }
        }
        return false;
    }
}
