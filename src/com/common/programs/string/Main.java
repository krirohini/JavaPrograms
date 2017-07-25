package com.commons.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.io.*;

public class Main {
    
    public String makeFilter(String passageWhole){
        String[] passage = passageWhole.split("\\|");
        if(passage.length==0) return "";
        String rst = passage[0];
        int max_len = handleMessage(passage[0]);
        for(int i=1;i<passage.length;i++){
            int crt_len = handleMessage(passage[i]);
            if(crt_len>max_len){
                rst = passage[i];
                max_len = crt_len;
            }else if(crt_len == max_len&&rst.length()>passage[i].length()){
                rst = passage[i];
                max_len = crt_len;
            }
        }
        return rst;
    }
    
    
    private int handleMessage(String passageWhole) {
        StringBuilder rst = new StringBuilder();
        String[] passagePara = passageWhole.split(" +");
        for(String ea : passagePara){
            char[] filter = ea.trim().toLowerCase().toCharArray();
            for(char c : filter){
                if(Character.isLetterOrDigit(c)) rst.append(c);
            }
        }
        return rst.length();
    }

    
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s;
    
     Main obj = new Main();
     
    while ((s = in.readLine()) != null) {
        
       
        System.out.println(obj.makeFilter(s));
      //System.out.println(s);
      
    }
    
    
   
  }
}
