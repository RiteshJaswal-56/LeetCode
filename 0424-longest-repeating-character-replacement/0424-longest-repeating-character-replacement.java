class Solution {
    public int characterReplacement(String s, int k) {
        int maxlength = 0;
        int maxfreq = 0;
        int left = 0;
        HashMap<Character , Integer > map = new HashMap<>();
        for(int right=0;right<s.length();right++){
            char ch = s.charAt(right);
            map.put(ch , map.getOrDefault(ch , 0) + 1);
            maxfreq = Math.max(maxfreq , map.get(ch));

            while((right-left+1) - maxfreq > k){
                char leftch = s.charAt(left);
                map.put(leftch , map.get(leftch) - 1);
                left++;
            }
            maxlength = Math.max(maxlength , right-left+1);
        }
        return maxlength;
    }
}