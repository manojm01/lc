class Solution {
public:
    int maxProfit(vector<int>& a) {
        int n = a.size();
        int maxp = 0;
        int buy = a[0];
        for(int i=0;i<n;i++){
            buy = min(buy,a[i]);
            maxp = max(maxp,a[i]-buy);
        }
        return maxp;
    }
};