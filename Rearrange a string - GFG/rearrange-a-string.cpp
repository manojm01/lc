// { Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

 // } Driver Code Ends


class Solution
{
  public:
    string arrangeString(string a)
    {
        //code here.
        int n = a.length();
        string ans = "";
        int sum=0;
        for(int i=0;i<n;i++){
            if(a[i]>='A' && a[i]<='Z'){
                ans += a[i];
            }
            else{
                sum += (a[i]-48);
            }
        }
        // cout<<sum<<endl;
        sort(ans.begin(),ans.end());
        return ans+to_string(sum);
    }
};

// { Driver Code Starts.

int main(){
    int t;
    cin >> t;
    while(t--){
        string s;
        cin >> s;
        Solution ob;
        cout <<ob.arrangeString(s) << endl;
    }
return 0;
}

  // } Driver Code Ends