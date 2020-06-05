import java.util.*;
class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int n = costs.length/2;
int costdiff[] = new int[n*2];

int mincost, index;
mincost=index=0;

for(int []cost : costs) {
    costdiff[index++] = cost[1]-cost[0];
    mincost+=cost[0];
}

Arrays.sort(costdiff);

for(int i=0; i<n; i++) 
  mincost+=costdiff[i];

  return mincost;

        
    }
}