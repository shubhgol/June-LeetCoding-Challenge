class Solution {
    public int singleNumber(int[] a) {
        int result = 0;

for(int i=0; i<32; i++) {
   int count=0;
    for(int j=0; j<a.length; j++) {
        if((a[j]&(1<<i))!=0)
          count++;
    }
    if(count%3!=0) 
      result|=(1<<i);
}

return result;
        
    }
}