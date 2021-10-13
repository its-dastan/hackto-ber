import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
    private static void printMazePaths(int startn, int startm, int endn, int endm, String ans){
        if(startn == endn && startm == endm){
            System.out.print(ans + " ");
            return;
        }
        if(startn < endn){
            printMazePaths(startn + 1, startm, endn, endm, ans + "V");
        }
        if(startm < endm){
            printMazePaths(startn, startm + 1, endn, endm, ans + "H");
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] s = in.readLine().trim().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        printMazePaths(1, 1, n, m, "");
        in.close();
    }
}