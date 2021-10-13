import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
    private static void targetSumSubsets(int[] arr, int index, int sum, String ans, int target){
        if(index == arr.length) return;
        if(sum == target){
            System.out.println(ans);
            return;
        }
        if(sum > target){
            return;
        }
        targetSumSubsets(arr, index+1, sum+arr[index], ans+arr[index]+" ", target);
        targetSumSubsets(arr, index+1, sum, ans, target);
    }
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int[] arr = new int[n];
        String[] s = in.readLine().trim().split(" ");
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        int target = Integer.parseInt(in.readLine());
        targetSumSubsets(arr, 0, 0, "", target);
    }
}