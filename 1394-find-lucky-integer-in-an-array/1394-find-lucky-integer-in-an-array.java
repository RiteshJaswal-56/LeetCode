class Solution {
    public int findLucky(int[] arr) {
        int n = arr.length;
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i] , map.get(arr[i]) + 1);
            }else{
                map.put(arr[i],1);
            }
        }
        int count = -1;
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i]) == arr[i]){
                count = Math.max(count , arr[i]);
            }
        }
        return count;
    }
}