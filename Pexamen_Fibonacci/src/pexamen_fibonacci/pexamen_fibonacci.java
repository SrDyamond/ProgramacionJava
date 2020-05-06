package pexamen_fibonacci;

import java.util.Scanner;

public class pexamen_fibonacci {
	static public void main (String []args) {
		Scanner sc=new Scanner(System.in);
		int n1=0,n2=1,r=0,limite=0;
		
		System.out.println("Inserta o limite");
		limite=sc.nextInt();
		
		do{
			System.out.print(r+ "\t");
			r=n1+n2;
			n1=n2;
			n2=r;
		}while(r<=limite);
		
		sc.close();
	}
}
