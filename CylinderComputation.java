package assign2;

import java.util.Scanner;

public class CylinderComputation {
	private static Scanner sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				double radius, sa, Volume, height, T;
				sc = new Scanner(System.in);
				
				System.out.println("\n Please Enter the radius of a Cylinder : ");
				radius = sc.nextDouble();
				System.out.println("\n Please Enter the Height of a Cylinder : ");
				height = sc.nextDouble();
				
				sa = 2 * Math.PI * radius * (radius + height);
				Volume = Math.PI * radius * radius * height;
				T = 2 * Math.PI * radius * radius;
				
				System.out.format("\n Surface area = %.2f", sa);
				System.out.format("\n The Volume = %.2f", Volume);
				System.out.format("\n Base Area = %.2f", T);
	}

}
