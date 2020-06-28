class Solution {
    public String getPermutation(int n, int k) {
       int fact[] = new int[n+1];
      List<Integer> list = IntStream.range(1, n + 1).mapToObj(x -> x).collect(Collectors.toList());
        
        StringBuilder sb = new StringBuilder("");
        
        fact[0]=1;
        
        for(int i=1; i<=n; i++)
             fact[i] = i*fact[i-1];
        
        for(int i=1; i<n; i++) {
            int x = fact[n-i];
            int index = (k%x==0)?(k/x)-1:k/x;
            sb.append(list.get(index));
            list.remove(index);
            k-=(index*x);
        }
        sb.append(list.get(0));
        
        return new String(sb);
        
    }
}