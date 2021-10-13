import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
    private static void printStringPermutations(String ques, String ans){
        if(ques.length() == 0){
            System.out.print(ans + " ");
            return;
        }
        for(int i=0; i<ques.length(); i++){
            char c = ques.charAt(i);
            String restLeftString = ques.substring(0, i);
            String restRightString = ques.substring(i+1);
            String restString = restLeftString + restRightString;
            printStringPermutations(restString, ans + c);
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine();
        printStringPermutations(s, "");
        in.close();
    }
}