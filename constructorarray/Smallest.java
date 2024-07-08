package constructorarray;

public class Smallest {
	public static void main(String args[]) {
		int ar[]= {10,2,3,11,5,6,7,1,9};
		for(int i=0;i<=ar.length;i++) {
		if(ar[0]<ar[i+1]) {
		//	System.out.println(ar[0]);
		}else {
			ar[0]=ar[i+1];
			//System.out.println(ar[i+1]);
		}
		System.out.println(ar[0]);
	}
	}
}
