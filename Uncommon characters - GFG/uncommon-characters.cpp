//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends

class Solution
{
    public:
        
string UncommonChars(string A, string B)
        {
            // code here
              set<char>s1;
            set<char>s2;
            int a=A.size();
            int b=B.size();
            //vector<char>ch;
            //char s[a+b]={0};
            string ans;
            for(int i=0;i<A.size();i++)
            {
                s1.insert(A[i]);
            }
            for(int i=0;i<B.size();i++)
            {
                s2.insert(B[i]);
            }
            
           for(auto itr=s1.begin();itr!=s1.end();itr++)
            {
                auto pos=s2.find(*itr);
                if(!(pos!=s2.end()))
                {
                    // ch.push_back(*itr);
                    ans+=*itr;
                }
            }
             for(auto itr1=s2.begin();itr1!=s2.end();itr1++)
            {
                auto pos1=s1.find(*itr1);
                if(!(pos1!=s1.end()))
                {
                //   ch.push_back(*itr1); 
                ans+= *itr1;
                }
                
            }
           
            // if(ch.empty())
            // {
            //   return "-1";
            // }
            // else
            // {
            //     sort(ch.begin(),ch.end());
            //      for(auto x:ch)
            //       cout<<x<<"-";
                   
                   
            //     for(int i=0;i<ch.size();i++)
            //     {
            //         s[i]=ch[i];
            //     }
            //       return s;
            
            // }
            sort(ans.begin(),ans.end());
            if(ans.size()==0)
            {
              return "-1";
            }
            
            return ans;
        }
};



//{ Driver Code Starts.

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        string A,B;
        cin>>A;
        cin>>B;
        Solution ob;
        cout<<ob.UncommonChars(A, B);
        cout<<endl;
    }
    return 0;
}
// } Driver Code Ends