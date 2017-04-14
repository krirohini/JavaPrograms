package just.test;

public class TestOverridingSub extends TestOverriding {

	@Override
	public int add(int b){
		return b*b;
	}
	
	public static void main(String[] args) {

		int a=9;
		
		TestOverriding t1 = new TestOverriding();
		System.out.println("method of base class ....." + t1.add(a));
		
		TestOverriding t2 = new TestOverridingSub();
		System.out.println("method of child class ....." + t2.add(a));

	}

}
