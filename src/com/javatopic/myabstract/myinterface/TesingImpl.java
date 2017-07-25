package com.myabstract.myinterface;

public class TesingImpl extends Testing{
	
	/* (non-Javadoc)
	 * @see com.myabstract.myinterface.Testing#add(int, int)
	 */
	@Override
	public int add(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		TesingImpl obj = new TesingImpl();
		System.out.println(obj.add(23, 2));

	}


}
