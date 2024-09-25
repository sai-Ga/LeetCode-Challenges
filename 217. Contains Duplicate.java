class Solution {
    public boolean containsDuplicate(int[] nums) {
      Set<Integer> visited = new HashSet<>();
      for(int i = 0; i<nums.lenght;i++){
      if(visited.contains(nums[i]){
         return true;
      } else{
        visited.add(nums[i]);
      }
      }
        return false;
    }
}
