class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }
        int maxcount = 0;
        for(int num : set){
            if(!set.contains(num-1)){
                int count = 1;
                int current = num;
                while(set.contains(current+1)){
                    current++;
                    count++;
                }
                maxcount = Math.max(count , maxcount);
            } 
        }
        return maxcount;
    }
}