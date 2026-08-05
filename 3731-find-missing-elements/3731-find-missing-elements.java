class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int m : nums){
            set.add(m);
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            min = Math.min(min , nums[i]);
            max = Math.max(max , nums[i]);
        }
        int ans = min;
        List<Integer> result = new ArrayList<>();
        while(ans <= max){
            if(!set.contains(ans)){
                result.add(ans);
            }
            ans++;
        }
        return result;
    }
}