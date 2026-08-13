class Solution {
    public String countAndSay(int n) {
        String result = "1";

        for(int i=1;i<n;i++){
            StringBuilder ans = new StringBuilder();
            int count = 1;
            for(int j=1;j<result.length();j++){
                if(result.charAt(j) == result.charAt(j-1)){
                    count++;
                }
                else{
                    ans.append(count).append(result.charAt(j-1));
                    count = 1;
                }
            }
            ans.append(count).append(result.charAt(result.length() - 1));
            result = ans.toString();
        }
        return result;
    }
}