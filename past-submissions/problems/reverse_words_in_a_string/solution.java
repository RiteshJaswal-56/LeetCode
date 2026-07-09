class Solution {
    public String reverseWords(String s) {
        s = s.trim();   
        String [] words = s.split("\\s+");
        StringBuilder sd = new StringBuilder();

        for(int i=words.length-1;i>=0;i--){
            sd.append(words[i]);
            if(i>0){
                sd.append(" ");
            }
        }
        return sd.toString();
    }
}