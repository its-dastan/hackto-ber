import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
    private static void printEncodings(String ques, String ans){
        if(ques.length() == 0){
            System.out.print(ans + " ");
            return;
        }else if(ques.length() == 1){
            char ch = ques.charAt(0);
            String rest = ques.substring(1);
            if(ch == '0') return;
            else {
                int charVal = ch - '0';
                char code = (char)('a' + charVal - 1);
                System.out.print(ans + code + " ");
                return;
            }
        }else{
            char ch = ques.charAt(0);
            String rest = ques.substring(1);
            if(ch == '0') return;
            else{
                int charVal = ch - '0';
                char code = (char)('a' + charVal - 1);
                printEncodings(rest, ans+code);
            }
            
            String ch12 = ques.substring(0, 2);
            String restString = ques.substring(2);
            int ch12Val = Integer.parseInt(ch12);
            if(ch12Val <= 26){
                char code = (char)('a' + ch12Val - 1);
                printEncodings(restString, ans+code);
            }
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader (System.in));
        String s = in.readLine();
        in.close();
        printEncodings(s, "");
    }
}