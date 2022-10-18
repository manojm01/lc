class Solution {
    public int[] intersect(int[] num1, int[] num2) {
        ArrayList<Integer>l = new ArrayList<>();
        ArrayList<Integer>l2 = new ArrayList<>();
        for(int i:num1)l.add(i);
        for(int i:num2)if(l.contains(i)){l2.add(i);l.remove(new Integer(i));}
        int ans[] = new int[l2.size()];
        for(int i=0;i<l2.size();i++)ans[i]=l2.get(i);
        return ans;
                                                
    }
}