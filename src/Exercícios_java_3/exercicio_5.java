package Exercícios_java_3;

import java.util.Scanner;

public class exercicio_5 {
	public static void main(String[] args) {
		Scanner sc;
		sc = new Scanner (System.in);
		
		//Faça um programa que leia os valores correspodente aos três lados a, b , c de um triangulo.
		// O programa deve então calcular a area de um triângulo utilizando a formula de Heron.
		
		double s, a, b, c, Area;

		System.out.println("Digite o valor de A:");
		a = sc.nextDouble();
		
		System.out.println("Digite o valor de B:");
		b = sc.nextDouble();
		
		System.out.println("Digite o valor de C:");
		c = sc.nextDouble();
		
		s = (a + b + c) / 2;
		
		Area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		
		System.out.printf("Area = %f", Area);

	}
}
