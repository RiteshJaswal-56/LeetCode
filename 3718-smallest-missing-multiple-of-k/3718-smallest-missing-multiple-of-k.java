class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }
        int i = 1;
        while(true){
            if(!set.contains(i*k)){
                return i*k;
            }
        i++;
        }
    }
}