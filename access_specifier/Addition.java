package access_specifier;

import java.util.Scanner;

public class Addition {
	public static void add2(int a,int b) {
		int sum=a+b;
		System.out.println(sum);
	}
	public static void add3(int a,int b,int c) {
		int sum=a+b+c;
		System.out.println(sum);
	}
	public static void main (String args[]){
		Scanner sc=new Scanner(System.in);
		Addition add=new Addition();
		add.add2(9, 8);
		add.add3(9, 8, 7);
	}

}
