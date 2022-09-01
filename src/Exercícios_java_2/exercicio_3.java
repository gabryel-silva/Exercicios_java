package Exercícios_java_2;

import java.util.Scanner;
public class exercicio_3 {
	public static void main(String[] args) {
		Scanner s;
		s = new Scanner(System.in);
		
		//Leia um valor e armazene em x, depois calcule e mostre o resultado da seguinte equação: y = 2*raiz²x+1/3x³

		
		double x, y;
		
		System.out.println("Digite o valor de X:");
		x = s.nextInt();
		
		y = 2 * Math.sqrt(x + 1)/3 * Math.pow(x, 3);
		
		System.out.println("O valor de Y é " + Math.round(y));
		
	}
}
