class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }
        for (int i = 0; i < words.length; i++) {
            char c = pattern.charAt(i);
            String currentword = words[i];

            if (map.containsKey(c)) {
                if (!map.get(c).equals(currentword)) {
                    return false;
                }
            } else {
                if (map.containsValue(currentword)) {
                    return false;
                }
                map.put(c, currentword);
            }
        }
        return true;
    }
}