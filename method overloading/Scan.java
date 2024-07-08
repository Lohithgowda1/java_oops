package basicjavaprogramm;

import java.util.Scanner;

public class Scan {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the details int,float,double,byte,long,short");
		int a=sc.nextInt();
		float b=sc.nextFloat();
		double c=sc.nextDouble();
		byte d=sc.nextByte();
		long e=sc.nextLong();
		short f=sc.nextShort();
		System.out.println("integer:"+a);
		System.out.println("float:"+b);
		System.out.println("double:"+c);
		System.out.println("byte:"+d);
		System.out.println("long:"+e);
		System.out.println("short:"+f);
	}

}
