class FreqStack {
     HashMap<Integer,Integer> frMap = new HashMap<>();
     HashMap<Integer,Stack<Integer>> frSt = new HashMap<>();
    int maxFreq = 0;
    
    public FreqStack() {
       
    }
    
    public void push(int val) {
        int freq = frMap.getOrDefault(val,0)+1;
        frMap.put(val,freq);
        if(freq>maxFreq)maxFreq = freq;
        frSt.computeIfAbsent(freq, f-> new Stack()).push(val);
    }
    
    public int pop() {
       Stack<Integer> s = frSt.get(maxFreq);
        int top = s.pop();
        
        if(s.isEmpty())maxFreq--;
        frMap.put(top,frMap.get(top)-1);
        
        return top;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */