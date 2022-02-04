class Solution {
public:
    int findMaxLength(vector<int>& a) {
        int n = a.size();
        unordered_map<int,int> m;
        int c = 0;
        
        m[0] = -1;;
        int maxL = 0;
        for(int i=0;i<n;i++){
            if(a[i]==0)c--;
            else c++;
            if(m.find(c)!=m.end()){
                maxL = max(maxL,i-m[c]);
            }
            else  
              m[c] = i;
        }
        return maxL;
    }
};