package just.test;

import java.io.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.io.*;

public class Main {
    
    public boolean isNumberContains(int num, int p, int q){
        int mod = 0;
    
        while(num>1){
            mod = num % 10;
            if(mod == p || mod == q){
                return true;
            }else{
                num = num /10;
            }
        }
        return false;
    }
    
    public void printOutThink(int n, int p, int q){
        for(int i =1; i <= n; i++){
            boolean isOutThink = false;
            
            if(i % p == 0 || i % q == 0){
                System.out.print("OUT");
                isOutThink = true; 
            }
            
            if(isNumberContains(i,p,q)){
                System.out.print("THINK");
                isOutThink = true;
            }
            
            if(! isOutThink){
                System.out.print(i);
            }
            
            if(i!=n){
                System.out.print(",");
            }
        }
    }
    
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s;
    
    int n=0, p=0, q=0;
     
    int[] a = new int[3];
    
    while ((s = in.readLine()) != null) {
     // System.out.println(s);
    try{
        
        String[] strs = s.trim().split("\\s+");

        for (int i = 0; i <= 2; i++) {
            a[i] = Integer.parseInt(strs[i]);
        }
        
        n = a[0];
        p = a[1];
        q = a[2];
        
        Main obj = new Main();
        obj.printOutThink(n, p, q);
        
    }catch(NumberFormatException e){
        System.out.print("Please Enter Numbers Only");
    }
    
    
     
     
    }
  }
}
