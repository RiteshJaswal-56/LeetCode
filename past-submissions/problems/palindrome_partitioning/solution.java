class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(s, 0 , result , new ArrayList<>());
        return result;
    }
    private void backtrack(String s , int start , List<List<String>> result , List<String> temp){
        if(start == s.length()){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start;i<s.length();i++){
            if(ispalindrome(s,start,i)){
                temp.add(s.substring(start,i+1));
                backtrack(s,i+1,result,temp);
                temp.remove(temp.size()-1);
            }
        }
    }
    private boolean ispalindrome(String s , int left , int right){
        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}