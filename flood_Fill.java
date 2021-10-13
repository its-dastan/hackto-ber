import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
    private static void floodFill(int[][] maze, int row, int col, String ans, boolean[][] visited){
        if(row < 0 || col < 0 || row == maze.length || col == maze[0].length || maze[row][col] == 1 || visited[row][col] == true){
            return;
        }
        
        if(row == maze.length - 1 && col == maze[0].length - 1){
            System.out.print(ans + " ");
            return;
        }
        visited[row][col] = true;
        floodFill(maze, row - 1, col, ans + "t", visited);
        floodFill(maze, row, col - 1, ans + "l", visited);
        floodFill(maze, row + 1, col, ans + "d", visited);
        floodFill(maze, row, col + 1, ans + "r", visited);
        visited[row][col] = false;
    }
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader (System.in));
        String[] s = in.readLine().trim().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int[][] maze = new int[n][m];
        for(int i=0; i<n; i++){
            String[] s1 = in.readLine().trim().split(" ");
            for(int j=0; j<m; j++){
                maze[i][j] = Integer.parseInt(s1[j]);
            }
        }
        in.close();
        boolean[][] visited = new boolean[n][m];
        floodFill(maze, 0, 0, "", visited);
    }
}