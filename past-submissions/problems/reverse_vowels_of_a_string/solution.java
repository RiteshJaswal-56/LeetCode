class Solution {
    public String reverseVowels(String s) {
        char [] arr = s.toCharArray();
        int st=0;
        int e=s.length()-1;
        String str = "aeiouAEIOU";
        while(st<e){
            while(st<e && str.indexOf(arr[st])==-1){
                st++;
            }
            while(st<e && str.indexOf(arr[e])==-1){
                e--;
            }
            char temp = arr[st];
            arr[st] = arr[e];
            arr[e] = temp;
            st++;
            e--;
        }
        return new String(arr);
    }
}