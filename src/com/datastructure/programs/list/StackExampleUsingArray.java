package com.datastructure.programs.list;

import junit.framework.TestCase;

public class StackExampleUsingArray  extends TestCase{

	public static int len = 5;
	public static int[] stkAry = new int[len];
	public static int top = -1;
	public  int min =0;

	public void push(int pushNum) {
		System.out.println("Top is at posiotion ..  "+top +"  PUSH  " +pushNum);
		stkAry[++top] = pushNum;			
		for(int i=0; i<=top; i++){
			System.out.println(+stkAry[i]);
		}
	}

	public void pop() throws IndexOutOfBoundsException  {
		if(top==-1) {
			System.out.println("Stack UnderFlow...");	
		}else{
			--top;
			System.out.println("...POP...Now, Position of TOP is .."+top);
			for(int i=0; i<=top; i++){
				System.out.println(+stkAry[i]);
			}			
		}
	}

	public void empty() {
		if(top==-1){
			System.out.println("STACK is EMPTY");
		}else {
			System.out.println("STACK is not EMPTY");
		}
	}
	
	public int peek() {
		System.out.println("...PEEK...Top object is "+stkAry[top]);
		return stkAry[top];
	}
	
	public boolean search(int num) {
		boolean hasElement=true;
		for(int i=0; i<top; i++) {
			if(stkAry[i]==num){
				System.out.println("Yes, Stack has element  " +num);
				hasElement=true;
				break;
			}else {				
				hasElement=false;
			}
		}
		return hasElement;
	}	
	
	public void getMin(int[] ary) {
		int min = stkAry[0];
		for(int i=1; i<len-1; i++) {			
			if(min>stkAry[i+1]){
				min=stkAry[i];
			}else{
				min=stkAry[i+1];
			}
		}
		System.out.println("Minimum is .. " +min);		
	}

	//
	public int pushAndMin(int pushNum) {
		
		System.out.println("Top is at posiotion ..  "+top +"  PUSH  " +pushNum);
		stkAry[++top] = pushNum;	
		if(min>pushNum) {
			min = pushNum;
		}else {
			//min = min;
		}
		for(int i=0; i<=top; i++){
			System.out.println(+stkAry[i]);
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackExampleUsingArray stk = new StackExampleUsingArray();
		/*stk.empty();
		stk.pop();
		stk.push(98);
		stk.push(838);
		stk.push(7);
		//System.out.println(stkAry);
		stk.pop();
		stk.push(341);
		stk.push(310462);
		stk.peek();
		stk.empty();
		stk.search(7);
		stk.push(23461);
		stk.push(288);
		stk.push(89320);
		stk.getMin(stkAry);*/
		stk.pushAndMin(45);
		stk.pushAndMin(89);
		stk.pushAndMin(21);
		stk.pushAndMin(48);
		int m = stk.pushAndMin(78);
		System.out.println(m);
	}

}
