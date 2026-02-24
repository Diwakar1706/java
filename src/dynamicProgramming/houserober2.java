package dynamicProgramming;

import java.util.*;

public class houserober2{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of houses: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter money in houses:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Max money robbed = " + rob(nums));
    }

    // House Robber 2 logic
    public static int rob(int[] nums) {

        int n = nums.length;

        // Edge case
        if (n == 1) return nums[0];

        // Case 1 → 0 to n-2
        int[] dp1 = new int[n + 1];
        Arrays.fill(dp1, -1);
        int case1 = solve(nums, 0, n - 2, dp1);

        // Case 2 → 1 to n-1
        int[] dp2 = new int[n + 1];
        Arrays.fill(dp2, -1);
        int case2 = solve(nums, 1, n - 1, dp2);

        return Math.max(case1, case2);
    }

    // Same structure as your memo code
    static int solve(int[] nums, int ind,
                     int end, int[] dp) {

        if (ind > end) {
            return 0;
        }

        if (dp[ind] != -1) {
            return dp[ind];
        }

        int steal =
                nums[ind] +
                        solve(nums, ind + 2, end, dp);

        int skip =
                solve(nums, ind + 1, end, dp);

        return dp[ind] =
                Math.max(steal, skip);
    }
}
