package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Value for x?");
		int x = in.nextInt();
		System.out.println("Value for y?");
		int y = in.nextInt();
		System.out.println("Value for z?");
		int z = in.nextInt();
		boolean a1 = x > y;
		boolean a2 = y > z;
		boolean aa = (a1 && a2);
		boolean b1 = x < y;
		boolean b2 = y < z;
		boolean bb = (b1 && b2);
		boolean isOrdered = (aa || bb);
		System.out.println(isOrdered);

	}

}
