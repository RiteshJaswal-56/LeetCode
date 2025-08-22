class Solution {
public:
    bool areAlmostEqual(string s1, string s2) {
        int n = s1.length();
        if (s1 == s2)
            return true;
        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 1; j >= 1; j--) {
                swap(s1[i], s1[j]);
                if (s1 == s2)
                    return true;
                swap(s1[i], s1[j]);

            }
        }
        return false;
    }
};