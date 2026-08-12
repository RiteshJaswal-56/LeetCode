class Solution {
    public int maximumSwap(int num) {
        char[] ch = String.valueOf(num).toCharArray();
        int max = num;
        for (int i = 0; i < ch.length; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;

                int value = Integer.parseInt(new String(ch));
                max = Math.max(max, value);

                temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
            }
        }
        return max;
    }
}