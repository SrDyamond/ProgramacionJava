/*
package relojDigital;

public class relojDigital {
	static public void main(String[] args) {
		int h=0,m=0,s=0;
		for(h=0;h<24;h++)
			for(m=0;m<60;m++)
				for(s=0;s<60;s++)
					System.out.println(h+":"+m+":"+s);
	}
}
*/

/*
package relojDigital; //Retardado.

public class relojDigital {
	static public void main(String[] args) {
		int h=0,m=0,s=0;
		for(h=0;h<24;h++)
			for(m=0;m<60;m++)
				for(s=0;s<60;s++) {
					System.out.println(h+":"+m+":"+s);
					for(int r=0;r<999999999;r++);
					for(int r=0;r<999999999;r++);
					for(int r=0;r<999999999;r++);
					for(int r=0;r<999999999;r++);
					for(int r=0;r<999999999;r++);
					for(int r=0;r<999999999;r++);
					for(int r=0;r<999999999;r++);
					for(int r=0;r<999999999;r++);
					for(int r=0;r<999999999;r++);
					for(int r=0;r<999999999;r++);
					for(int r=0;r<999999999;r++);
					for(int r=0;r<999999999;r++);
				}
	}
}
*/

/*
package relojDigital; //RelojDigital seteando la hora.
import java.util.Scanner;
public class relojDigital {
	static public void main(String[] args) {
		int h=0,m=0,s=0,h1=0,h2=0,h3=0;
		Scanner hora = new Scanner (System.in);
		Scanner min = new Scanner (System.in);
		Scanner seg = new Scanner (System.in);
		System.out.print("Introduzca hora:");
		h1 = hora.nextInt();
		System.out.print("Introduzca minutos:");
		h2 = min.nextInt();
		System.out.print("Introduzca segundos:");
		h3 = seg.nextInt();
		for(h=h1;h<24;h++)
			for(m=h2;m<60;m++)
				for(s=h3;s<60;s++)
					System.out.println(h+":"+m+":"+s);
		hora.close();
		min.close();
		seg.close();
	}
}
*/

/*
package relojDigital; //Retardado.
import java.lang.Thread;
public class relojDigital {
	static public void main(String[] args) throws InterruptedException {
		int h=0,m=0,s=0;
		for(h=0;h<24;h++)
			for(m=0;m<60;m++)
				for(s=0;s<60;s++) {
					System.out.println(h+":"+m+":"+s);
					Thread.sleep(1000);
				}
	}
}
*/
