class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()>t.length())
  return false;

  int n = s.length();
  int m = t.length();
  int i, j;
  i=j=0;

  while(i<n && j<m) {
      if(s.charAt(i)==t.charAt(j)) {
          i++;
          j++;
      } else 
      j++;
          
  }
if(i>=n)
  return true;
  return false;
        
    }
}