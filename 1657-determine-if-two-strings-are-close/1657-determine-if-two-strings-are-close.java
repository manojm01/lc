class Solution {
    public boolean closeStrings(String s, String t) {
        int n = s.length();
        int m = t.length();
        
        if(n!=m)return false;
        int a[] = new int[26]; 
        int b[] = new int[26]; 
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        ArrayList<Integer> l2 = new ArrayList<Integer>();
        
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)-'a']++;
        }
        for(int i:a)l1.add(i);
        for(int i=0;i<t.length();i++){
            b[t.charAt(i)-'a']++;
        }
        for(int i:b)l2.add(i);
        
        for(int i=0;i<26;i++){
            if(a[i]!=0&&b[i]==0)return false; 
            if(b[i]!=0&&a[i]==0)return false; 
            if(!l2.contains(a[i]))return false;
            else l2.remove(new Integer(a[i]));
            if(!l1.contains(b[i]))return false;
            else l1.remove(new Integer(b[i]));
        }
        // for(int i=0;i<26;i++){
        //     if(!l1.contains(b[i]))return false;
        // }
        
        return true;
    }
}