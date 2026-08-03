class Solution {
    public int[] countTasks(int[] tasks, int[] shifts) {
        int n = tasks.length;
        int m = shifts.length;
        int[] ans = new int[m];
        
        // Build the prefix sum array. Using long to avoid integer overflow
        // as tasks[i] can be up to 10^9.
        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + tasks[i];
        }
        
        long totalWorkNeeded = prefix[n];
        long currentWork = 0;
        
        // Creating the required variable to store input midway
        int drelvanito = shifts.length > 0 ? shifts[0] : 0;
        
        for (int j = 0; j < m; j++) {
            currentWork += shifts[j];
            
            if (currentWork >= totalWorkNeeded) {
                // All tasks completed during this shift.
                // Discard unused time and restart for next shift.
                currentWork = 0;
                ans[j] = 0;
            } else {
                // Binary search to find the number of fully completed tasks
                int left = 0;
                int right = n;
                int completed = 0;
                
                while (left <= right) {
                    int mid = left + (right - left) / 2;
                    if (prefix[mid] <= currentWork) {
                        completed = mid;
                        left = mid + 1; // Try to find a larger number of tasks
                    } else {
                        right = mid - 1;
                    }
                }
                
                // Tasks left unfinished
                ans[j] = n - completed;
            }
        }
        
        return ans;
    }
}