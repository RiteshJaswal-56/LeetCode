class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        String [] alph = {
            "" , "" , "abc" , "def", "ghi" , "jkl", "mno" , "pqrs", "tuv" , "wxyz"
        };
        backtrack(digits , result , alph , 0 , new StringBuilder());
        return result;
    }
    private void backtrack(String digits , List<String> result , String[] alph , int index , StringBuilder temp){
        if(index == digits.length()){
            result.add(temp.toString());
            return;
        }
        int digit = digits.charAt(index) - '0';
        String letter = alph[digit];
        for(int i=0;i<letter.length();i++){
            temp.append(letter.charAt(i));
            backtrack(digits,result,alph,index+1,temp);
            temp.deleteCharAt(temp.length()-1);
        }
    }
}