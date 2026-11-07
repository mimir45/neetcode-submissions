class Solution {
    public int longestConsecutive(int[] nums) {
        int longest =0;
        Set<Integer> numSet = new HashSet<>();

        for(int num : nums){
            numSet.add(num);
        }

        for(int num : numSet){
            if(!numSet.contains(num-1)){
                int len = 1;
                while(numSet.contains(num+len)){
                    len++;
                }
                longest = Math.max(len,longest);
            }

        }
        return longest;
        
    }
}
