class Solution {
    public int findDuplicate(int[] a) {
        while(a[0]!=a[a[0]]){
            int next = a[a[0]];
            a[a[0]] = a[0];
            a[0] = next;
        }
        return a[0];
    }
}
