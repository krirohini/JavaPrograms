import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test{
  /*public static void main(String[] args) {
    System.out.println("main 1");
  }*/
  public static void main() throws NumberFormatException, IOException {
    /*System.out.println("main 2");
    System.out.println(Integer.parseInt("" + 2 + 3));
    System.ut.println(13%18);
    */
    
    /*try{
    	int a = 4/0;
    }catch(Exception e){
    	System.err.println("Ex");
    }finally {
    	System.err.println("fi");
	}*/
    
	  
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    int M=Integer.parseInt(br.readLine());
	    long countX[]=new long[M+1];
	    long countY[]=new long[M+1];
	    countX[0]=0; countY[0]=0;
	    countX[1]=1; countY[1]=1;
	    countX[2]=1; countY[2]=2;
	    for(int i=3;i<=M;i++){
	        countX[i]=countY[i-1];
	        countY[i]=countX[i-1]+countY[i-1];
	    }
	    long finalCount=countX[M]+countY[M];
	    System.out.println(finalCount*finalCount);
	  
	  
    
  }
}