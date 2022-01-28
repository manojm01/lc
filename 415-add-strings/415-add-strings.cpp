class Solution {
public:
    string addStrings(string s1, string s2) {
        int n = s1.length();
        int m = s2.length();
        int carry=0;
        int i=n-1,j=m-1,in=0;
        string ans = "";
        
        while(i>=0 || j>=0 || carry){
            int sum=0;
            if(i>=0) sum += (s1[i--]-'0');
            if(j>=0) sum += (s2[j--]-'0');
            sum += carry;
            carry = sum/10;
            sum = sum%10;
            ans = to_string(sum) + ans;
        }   
        return ans;
        
    }
};
