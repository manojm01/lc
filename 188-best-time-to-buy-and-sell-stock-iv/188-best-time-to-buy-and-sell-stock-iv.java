class Solution {
    public int maxProfit(int k, int[] A) {
        int n = A.length;
        if(n==0) return 0;
		int[][] dp = new int[k + 1][n];

		int trans, day = 0;
		for (trans = 1; trans <= k; trans++) {
			int mx = Integer.MIN_VALUE;
			for (day = 1; day < n; day++) {
				if (dp[trans - 1][day - 1] - A[day - 1] > mx)
					mx = dp[trans - 1][day - 1] - A[day - 1];

				if (mx + A[day] > dp[trans][day - 1])
					dp[trans][day] = mx + A[day];
				else
					dp[trans][day] = dp[trans][day - 1];

			}
		}
		return dp[k][n-1];       
    }
}