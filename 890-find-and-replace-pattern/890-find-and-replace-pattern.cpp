class Solution {
public:
    vector<string> findAndReplacePattern(vector<string>& w, string p) {
        
        int n = w.size();
        int ps = p.size();
        vector<string> ans;
        for(int i=0;i<n;i++){
            unordered_map<char,char>m;
            unordered_map<char,int>mr;
            int x = w[i].size();
            if(ps!=x)continue;
            bool f = false;
            
            for(int j=0;j<x;j++){
                if(m.find(p[j])==m.end()){
                    if(mr[w[i][j]]==1){
                       f = true;
                       break;
                    }
                    m[p[j]] = w[i][j];
                    mr[w[i][j]]++;
                }
                else{
                   if(m[p[j]] != w[i][j]){
                       f = true;
                       break;
                   } 
                }
            }
            if(!f)ans.push_back(w[i]);
        }
        return ans;
    }
};
