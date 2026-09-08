class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> openBracketIndex = new Stack<>();
        Stack<Integer> starIndex = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                openBracketIndex.push(i);
            } else if (c == '*') {
                starIndex.push(i);
            } else {
                if (!openBracketIndex.isEmpty()) {
                    openBracketIndex.pop();
                } else if (!starIndex.isEmpty()) {
                    starIndex.pop();
                } else {
                    return false;
                }
            }
        }
        
        while (!openBracketIndex.isEmpty() && !starIndex.isEmpty()) {
            if (openBracketIndex.peek() < starIndex.peek()) {
                openBracketIndex.pop();
                starIndex.pop();
            } else {
                break;
            }
        }
        
        return openBracketIndex.isEmpty();
    }
}