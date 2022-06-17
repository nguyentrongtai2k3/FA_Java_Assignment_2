package assign2;

import java.util.Scanner;

public class Logical {
	public static void main(String[] args) {
		int x,y,z,t;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input first number : ");
		x = sc.nextInt();
		System.out.println("Input second number : ");
		y = sc.nextInt();
		System.out.println("Input third number : ");
		z = sc.nextInt();
		System.out.println("Input fourth number : ");
		t = sc.nextInt();
		if(x==y && y==z&&z==t) 
			System.out.println("Numbers are equal!");
		else System.out.println("Numbers are not equal!");
	}
}
