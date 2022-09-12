class Solution {
    public int bagOfTokensScore(int[] a, int P) {
        Arrays.sort(a);
        int lo = 0, hi = a.length - 1;
        int points = 0, ans = 0;
        while (lo <= hi && (P >= a[lo] || points > 0)) {
            while (lo <= hi && P >= a[lo]) {
                P -= a[lo++];
                points++;
            }

            ans = Math.max(ans, points);
            if (lo <= hi && points > 0) {
                P += a[hi--];
                points--;
            }
        }

        return ans;
    }
}