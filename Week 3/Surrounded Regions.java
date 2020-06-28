class Solution {
    boolean[][] visited;
    public void solve(char[][] board) {
        int n = board.length;
        if(n == 0) return;
        int m = board[0].length;
        
        visited = new boolean[n][m];
        
        for(int i=0;i<board.length;i++) {  
            dfs(board, i, 0, visited);
            dfs(board, i, m-1, visited);
        }
        
        for(int j=1;j<board[0].length-1;j++) { 
            dfs(board, 0, j, visited);
            dfs(board, n-1, j, visited);
        }
        
        for(int i=0;i<n;i++) 
            for(int j=0;j<m;j++) 
                if(board[i][j] == 'O')      
                    board[i][j] = 'X';
                else if(board[i][j] == '#')   
                    board[i][j] = 'O';
    }
    
    public void dfs(char[][] board,int i,int j,boolean[][] visited) {
        int n = board.length;
        int m = board[0].length;
        if(i>=0 && i < n && j>=0 && j<m && !visited[i][j] && board[i][j] == 'O') {
            visited[i][j] = true;
            board[i][j] = '#';
            dfs(board,i+1,j,visited);
            dfs(board,i-1,j,visited);
            dfs(board,i,j+1,visited);
            dfs(board,i,j-1,visited);
        }
    }
}