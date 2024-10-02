class Solution {
		public int characterReplacement(String s, int k) {
		 int[] occurance = new int[26];
		 int left =0;
		 int answer =0;
		 int maxOccurance =0;
		 
		 for(int right=0; right<s.length();right++){
			maxOccurance = Math.max(maxOccurance, ++occurance[s.charAt(right) - 'A']);
			if(right-left+1-maxOccurance>k){
				occurance[s.charAt(left) - 'A']--;
                left++;
			}			
			answer = Math.max(answer,right-left+1);
		 
         }
        
		return answer;
		}
}
	