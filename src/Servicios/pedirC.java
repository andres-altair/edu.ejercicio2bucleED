package Servicios;

import java.util.Scanner;

public class pedirC implements pedirI {

	@Override
	public int pedir() {
		Scanner scan = new Scanner(System.in);
		System.out.println("escribr un numero entero");
		int num = scan.nextInt();
		return num;
	}

}
