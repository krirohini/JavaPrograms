package just.test;

import java.io.*;

public class Square {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s;
    
    int a;
    long result;
    while ((s = in.readLine()) != null) {
        
      System.out.println(s);
      
      try{
        a = Integer.parseInt(s);
        result = a * a;
        System.out.println("Square is .." + result);
      
      }catch(NumberFormatException e){
          System.out.println("Please Input an Integer");
      }
    }
  }
}