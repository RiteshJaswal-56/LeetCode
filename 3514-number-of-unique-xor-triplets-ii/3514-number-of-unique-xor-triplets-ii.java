import java.util.*;

class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;

        if (n < 3) {
            HashSet<Integer> set = new HashSet<>();
            for (int num : nums) {
                set.add(num);
            }
            return set.size();
        }

        HashSet<Integer> pairXor = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                pairXor.add(nums[i] ^ nums[j]);
            }
        }

        HashSet<Integer> answer = new HashSet<>();

        for (int x : pairXor) {
            for (int num : nums) {
                answer.add(x ^ num);
            }
        }

        return answer.size();
    }
}