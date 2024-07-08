package constructorarray;

import java.util.Scanner;

public class Arraysum {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int ar[]=new int[5];
		int sum=0;
		int avg=0;
		System.out.println("enter the number ");
		for(int i=0;i<5;i++) {
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++) {
			sum+=ar[i];
			avg=sum/5;
		}
		System.out.println("the sum of the number is:"+sum);
		System.out.println("the average is:"+avg);
	}

}
