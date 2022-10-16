class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        if(num==0)return true;
        for(int i=1;i<num;i++){
            if(i+fun(i)==num)return true;
        }
        return false;
    }
     public int fun(int n){
        int x=0;
        while(n>0){
            x = x*10 + n%10;
            n/=10;
        }
        return x;
    }
}