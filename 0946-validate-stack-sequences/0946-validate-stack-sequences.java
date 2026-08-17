class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        int index = 0;
        for(int num : pushed){
            st.push(num);
            while(!st.isEmpty() && st.peek() == popped[index]){
                st.pop();
                index++;
            }
        }
        return st.isEmpty();
    }
}