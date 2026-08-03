class Solution {
    public int[] countTasks(int[] tasks, int[] shifts) {
        int n = tasks.length;
        int m = shifts.length;
        int[] ans = new int[m];
        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + tasks[i];
        }
        
        long totalWorkNeeded = prefix[n];
        long currentWork = 0;
        
        for (int j = 0; j < m; j++) {
            currentWork += shifts[j];
            
            if (currentWork >= totalWorkNeeded) {
                currentWork = 0;
                ans[j] = 0;
            } else {
                int left = 0;
                int right = n;
                int completed = 0;
                
                while (left <= right) {
                    int mid = left + (right - left) / 2;
                    if (prefix[mid] <= currentWork) {
                        completed = mid;
                        left = mid + 1; 
                    } else {
                        right = mid - 1;
                    }
                }  
                ans[j] = n - completed;
            }
        }
        
        return ans;
    }
}