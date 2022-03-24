class Solution {
    public int countStudents(int[] st, int[] sd) {
        int ans = 0;
        Queue <Integer> q= new LinkedList<>();
        for(int i:st){
            q.add(i);
        }
        ArrayList<Integer> l = new ArrayList<>();
        for(int i:sd)l.add(i);
        int x = 0;
        
        while(x!=q.size()){
            if(q.peek()==l.get(0)){
                q.poll();
                l.remove(0);
                x=0;
            }
            else{
                x++;
                q.add(q.poll());
            }
        }
        return x;
    }
}