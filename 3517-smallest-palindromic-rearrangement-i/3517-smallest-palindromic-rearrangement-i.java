import java.util.Arrays;

class Solution {
    public String smallestPalindrome(String s) {

        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        StringBuilder left = new StringBuilder();
        String middle = "";

        int i = 0;

        while (i < arr.length) {

            int count = 1;

            while (i + 1 < arr.length && arr[i] == arr[i + 1]) {
                count++;
                i++;
            }

            for (int j = 0; j < count / 2; j++) {
                left.append(arr[i]);
            }

            if (count % 2 == 1) {
                middle = String.valueOf(arr[i]);
            }

            i++;
        }

        String right = new StringBuilder(left).reverse().toString();

        return left.toString() + middle + right;
    }
}