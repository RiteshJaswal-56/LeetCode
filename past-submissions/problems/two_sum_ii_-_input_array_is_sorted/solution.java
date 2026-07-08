class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int [] result = new int[2];
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i+1;j<n;j++){
                sum=numbers[i] + numbers[j];

                if(sum==target){
                    result[0] = i+1;
                    result[1] = j+1;
                    return result;
                }
            }
        }
        return result;
    }
}