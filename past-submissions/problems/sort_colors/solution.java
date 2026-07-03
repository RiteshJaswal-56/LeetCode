class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int countzeros = 0;
        int countones = 0;
        int counttwos = 0;
        for(int i=0;i<n;i++){
            if(nums[i] == 0){
                countzeros++;
            }
            else if(nums[i]==1){
                countones++;
            }
            else{
                counttwos++;
            }
        }
        int [] temp = new int[n];
        for(int i=0; i<countzeros; i++){
            temp[i] = 0;
        }
        for(int i=countzeros; i<countzeros + countones; i++){
            temp[i] = 1;
        }
        for(int i=countzeros + countones; i<n; i++){
            temp[i] = 2;
        }
        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }
}