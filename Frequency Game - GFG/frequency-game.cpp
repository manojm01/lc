// { Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;


 // } Driver Code Ends
// User function Template for C++

int LargButMinFreq(int a[], int n) {
    // code here
    unordered_map<int,int>m;
    int ans=a[0];
    for(int i = 0;i<n; i++){
        if(m.find(a[i])==m.end())m[a[i]]=1;
        else m[a[i]]++;
    }
    
    for(auto &i:m){
        if(i.second==1&&i.first>ans){
            ans = i.first;
        }
    }
    return ans;
}

// { Driver Code Starts.

int main() {
    int t;
    cin >> t;
    // Iterating over testcases
    while (t--) {
        int n;
        cin >> n;

        int arr[n];

        for (int i = 0; i < n; i++) cin >> arr[i];

        cout << LargButMinFreq(arr, n) << endl;
    }
}  // } Driver Code Ends