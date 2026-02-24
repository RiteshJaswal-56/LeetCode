class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(n,result,0,0,"");
        return result;
    }
    private void backtrack(int n , List<String> result , int st , int end , String temp){
        if(temp.length() == n*2){
            result.add(temp);
            return;
        }
        if(st < n){
            backtrack(n,result,st+1,end,temp+'(');
        }
        if(end < st){
            backtrack(n,result,st,end+1,temp+')');
        }
    }
}