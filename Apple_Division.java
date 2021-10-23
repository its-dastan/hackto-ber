import java.lang.*;
import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int[] arr = new int[n];
        String[] s = in.readLine().trim().split(" ");
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        long sum = 0;
        for(int num : arr){
            sum += num;
        }
        long ans = Long.MAX_VALUE;
        int size = (1<<n);
        for(int i=0; i<size; i++){
            long subSum = 0;
            for(int j=0; j<n; j++){
                if((i&(1<<j)) != 0) subSum += arr[j];
            }
            long otSetSum = sum - subSum;
            long diff = Math.abs(subSum - otSetSum);
            if(diff < ans) ans = diff;
        }
        System.out.println(ans);
        in.close();
    }
}
