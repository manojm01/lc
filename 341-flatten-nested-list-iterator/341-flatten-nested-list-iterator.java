/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {
    Queue<NestedInteger> q =new LinkedList<>();
    
    public NestedIterator(List<NestedInteger> nestedList) {
        solve(nestedList);
    }
    
    public void solve(List<NestedInteger> nestedList){
        for(int i=0;i<nestedList.size();i++){
            if(nestedList.get(i).isInteger()){
                q.add(nestedList.get(i));
            }
            else{
                solve(nestedList.get(i).getList());
            }
        }
    }

    @Override
    public Integer next() {
        return q.poll().getInteger();
    }

    @Override
    public boolean hasNext() {
     return !q.isEmpty();   
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */