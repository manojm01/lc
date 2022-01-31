class Solution {
public:
    int findLeastNumOfUniqueInts(vector<int>& a, int k) {
        map<int,int>m;
        for(int i:a){
            m[i]++;
        }
        int ms = m.size();
        int j=0;
        vector<int>f(ms);
        for(auto it:m){
            f[j++]=it.second;
        }
        sort(f.begin(),f.end());
        int c=0;
        
        while(k>0){
         k = k-f[c];
            if(k>=0){
                c++;
            }
            else{
                break;
            }
        }
        return ms-c;
    }
};