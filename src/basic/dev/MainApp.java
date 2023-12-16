package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a");
		a = sc.nextInt();
		System.out.println("Nhap b");
		b = sc.nextInt();
		double tong = a + b;
		System.out.println(a+ "+" +b + "=" + tong);
		double hieu = a-b;
		System.out.println(a+ "-" +b + "=" + hieu);
		double tich = a*b;
		System.out.println(a+ "x" +b+ "=" + tich);
		double thuong = a/b;
		System.out.println(a+ ":" +b+ "=" +thuong);
		System.out.println("C=");
		c = sc.nextInt();
		System.out.println(c+ ">" +a+ "" + (c>a));
		System.out.println(c+ "<" +a+ "" + (c<a));
		System.out.println(c+ ">=" +a+ "" + (c>=a));
		System.out.println(c+ "<=" +a+ "" + (c<=a));
	}

}
