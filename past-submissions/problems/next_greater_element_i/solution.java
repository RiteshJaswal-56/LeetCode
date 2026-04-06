class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        Stack<Integer> st = new Stack<>();
        HashMap<Integer , Integer> map = new HashMap<>();
        int ans [] = new int[m];
        for(int i=m-1;i>=0;i--){
            while(!st.isEmpty() && st.peek() <= nums2[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = -1;
            }
            else{
                ans[i] = st.peek();
            }
            map.put(nums2[i] , ans[i]);
            st.push(nums2[i]);
        }
        int res[] = new int[n]; 
        for(int i=0;i<n;i++){
            res[i] = map.get(nums1[i]);
        }
        return res;

    }
}