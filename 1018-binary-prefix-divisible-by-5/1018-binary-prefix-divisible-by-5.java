class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> list = new ArrayList<>();
        int num = 0;
        for(int i=0;i<nums.length;i++){
            num = (2 * num + nums[i]) % 5;
            if(num == 0){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }
}