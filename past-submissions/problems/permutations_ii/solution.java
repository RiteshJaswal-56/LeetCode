class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] duplicate = new boolean[nums.length];
        backtrack(nums, duplicate, result ,new ArrayList<>());
        return result;
    }
    private void backtrack(int[] nums ,boolean[] duplicate,List<List<Integer>> result , List<Integer> temp){
        if(temp.size() == nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(duplicate[i]) continue;
            if (i>0 && nums[i] == nums[i - 1] && !duplicate[i - 1]) continue;
            duplicate[i] = true;
            temp.add(nums[i]);
            backtrack(nums,duplicate, result ,temp);
            temp.remove(temp.size()-1);
            duplicate[i] = false;
        }
    }
}