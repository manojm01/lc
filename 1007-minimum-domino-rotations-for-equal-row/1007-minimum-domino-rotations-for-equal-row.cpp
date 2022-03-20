class Solution {
public:
    int minDominoRotations(vector<int>& tops, vector<int>& bottoms) {
        unordered_map<int,int>m;
        int n = tops.size();
        for(auto i:tops)m[i]++;
        for(auto i:bottoms)m[i]++;
        int max = 0;
        int maxi = tops[0];
        for(auto i:m){
            if(max<=i.second){
               maxi = i.first;
               max = i.second;
            }
        }
        for(int i=0;i<n;i++){
            if(tops[i]!=maxi && bottoms[i]!=maxi)return -1;
       }
        
        int f = 0;
        int s = 0;
        
        for(auto i:tops){
            if(i==maxi)f++;
        }
        for(auto i:bottoms){
            if(i==maxi)s++;
        }
        int ans=0;
        if(f>s){
            for(int i=0;i<n;i++){
                if(tops[i]!=maxi && bottoms[i]==maxi){
                    ans++;
                }
            }
        }
        else{
            for(int i=0;i<n;i++){
                if(tops[i]==maxi && bottoms[i]!=maxi){
                    ans++;
                }
            }
        }
        
        
        
//         int f = tops[0];
//         int s = bottoms[0];
//         int fc=0;
//         int sc=0;
//         for(int i=1;i<n;i++){
//             if(tops[i]==f)fc++;
//             else if(tops[i]==s)sc++;
//             if(bottoms[i]==f)fc++;
//             else if(bottoms[i]==s)sc++;
//         }
//         if(fc>=n)return f;
//         else if(sc>=n)return s;
        
        return ans;
    }
};