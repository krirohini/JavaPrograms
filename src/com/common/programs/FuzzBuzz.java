package com.common.programs;

public class FuzzBuzz {
	
	public void isNumberContains(int N, int p, int q){
		
		int mod;
		int num;
			
		if(N>=1){
			for(int i=0; i<N; i++){
				if(i == p || i == q){
					System.out.println("OUTTHINK ,");
				}
				else  {
					num = i;
					while(num > 10){
						mod = num % 10;
						if(mod == p || mod == q){
							System.out.println("Think ,");
						}
						else {
							num = num / 10;
						}
					}
				}
//				else {
//					System.out.println(+i +" ,");
//				}				
			}				
		}
	}

	
public boolean isNumberContains2(int num, int p, int q){
	int mod = 0;
	while(num > 1){
		mod = num % 10;
		if(mod == p || mod == q){
			return true;
		}
		else {
			num = num / 10;
		}
	}
	return false;
	
}

public void printOutThink(int N, int p, int q)
	{

		for(int i=1; i<=N; i++){
			boolean isOutThink = false;

			if(i % p == 0 || i%q == 0) {
				System.out.print("OUT");
				isOutThink = true;
			}

			if(isNumberContains2(i, p, q)) {
				System.out.print("Think");
				isOutThink = true;
			}

			if(!isOutThink) {
				System.out.print(i);
			}
			System.out.println(",");
		}
	}
	
	
	
	public static void main(String[] args) {
		FuzzBuzz obj = new FuzzBuzz();
		obj.printOutThink(15, 3, 4);
		
	}

}
