class Solution {
    HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
    public int numTrees(int n) {
        if(n==0||n==1)
 return 1;

 if(mp.containsKey(n))
  return mp.get(n);

  int count = 0;

  for(int i=1; i<=n; i++)
    count+=numTrees(i-1)*numTrees(n-i);

    mp.put(n, count);

    return mp.get(n);
    }
}