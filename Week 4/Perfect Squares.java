class Solution {
    HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
    public int numSquares(int n) {
        int count =n ;
        if(n<4)
            return n;
        
        if(mp.containsKey(n))
             return mp.get(n);
        for(int i=1; i*i<=n; i++) {
            count = Math.min(count, numSquares(n-i*i)+1);
             mp.put(n,count);
        }
       
        
        return count;
    }
}