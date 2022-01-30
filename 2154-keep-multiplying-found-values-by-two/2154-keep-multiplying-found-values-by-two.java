class Solution {
    public int findFinalValue(int[] a, int o) {
        Set<Integer> s = new HashSet<>();
        for(int i:a)s.add(i);
        while(true){
            if(!s.contains(o)){
                return o;
            }
            o = o*2;
        }
    }
}