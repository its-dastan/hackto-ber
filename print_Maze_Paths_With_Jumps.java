import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
    private static void printMazePathsWithJumps(int startn, int startm, int endn, int endm, String ans){
        if(startn == endn && startm == endm){
            System.out.print(ans + " ");
            return;
        }
        for(int i=1; i<=(endn - startn); i++){
            printMazePathsWithJumps(startn + i, startm, endn, endm, ans + "V" + i);
        }
        for(int i=1; i<=(endm - startm); i++){
            printMazePathsWithJumps(startn, startm + i, endn, endm, ans + "H" + i);
        }
        for(int i=1; i<=(endm - startm) && i<=(endn - startn); i++){
            printMazePathsWithJumps(startn + i, startm + i, endn, endm, ans + "D" + i);
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] s = in.readLine().trim().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        printMazePathsWithJumps(1, 1, n, m, "");
        in.close();
    }
}