package constructorarray;

public class Odd {
	public static void main(String args[]) {
		int ar[]= {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2!=0) {
				System.out.println("its is a odd number:"+ar[i]);
			}
		}
	}

}
