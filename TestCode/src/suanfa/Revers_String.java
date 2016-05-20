package suanfa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Revers_String {
    public static void main(String[] args) {
        String str="abc";
        	
            //char[] rever= input.toCharArray();
            
           char[] revers=str.toCharArray();
           
           for(int i=revers.length-1;i>=0;i--){
        	   System.out.print(revers[i]);
           }
            
        }
        
}