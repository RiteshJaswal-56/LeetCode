class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("C")){
                st.pop();
            }
            else if(operations[i].equals("D")){
                st.add(st.peek() * 2);
            }
            else if(operations[i].equals("+")){
                int top = st.pop();
                int newTop = top + st.peek();
                st.add(top);
                st.add(newTop);
            }
            else{
                st.add(Integer.parseInt(operations[i]));
            }
        }
        int result = 0;
        while(!st.isEmpty()){
            result += st.pop();
        }
        return result;
    }
}