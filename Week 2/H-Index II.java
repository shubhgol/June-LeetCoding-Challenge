class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        if(n==0)
             return 0;
        int i,j;
        i=0; j = n-1 ;
      
        
        while(i<=j) {
            int mid = i+(j-i)/2;
            if(citations[mid]< n-mid) {
                
                 i = mid+1;
            } else {
                j= mid-1;
            }
        }
        return n-i;
    }
}