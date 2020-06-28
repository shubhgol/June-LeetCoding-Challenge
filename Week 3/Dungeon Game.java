class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length, n = dungeon[0].length;
        
        int[][] hp = new int[m][n];
        
        hp[m-1][n-1] = Math.max(1, 1 - dungeon[m-1][n-1]);
        
        for (int i = m - 2; i >= 0; i--)
            hp[i][n-1] = Math.max(1, hp[i+1][n-1] - dungeon[i][n-1]);
        
        for (int i = n - 2; i >= 0; i--)
            hp[m-1][i] = Math.max(1, hp[m-1][i+1] - dungeon[m-1][i]);
        
        for (int i = m - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                int opt1 = Math.max(1, hp[i+1][j] - dungeon[i][j]);
                int opt2 = Math.max(1, hp[i][j+1] - dungeon[i][j]);
                hp[i][j] = Math.min(opt1, opt2);
            }
        }
        
        return hp[0][0];
        
    }
}