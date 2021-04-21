package aplication;

import java.util.Locale;

import java.util.Scanner;

import entidade.triangulo;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//double xA, xB, xC, yA, yB, yC;	
        triangulo x, y;
        x = new triangulo();
        y = new triangulo();
        
		
        System.out.println("Entre com os lados do triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Entre com os lados do triangulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		/*double p = (x.a + x.b + x.c) / 2.0;
		double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
		p = (y.a + y.b + y.c) / 2.0;
		double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
		*/
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Triangulo X area: %.4f%n", areaX);
		System.out.printf("Triangulo Y area: %.4f%n", areaY);
		if (areaX > areaY) {
			System.out.println("Maior area: X");
		} else {
			System.out.println("Maior area: Y");
		}
		sc.close();
	}

}
