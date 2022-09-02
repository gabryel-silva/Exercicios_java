package Exercícios_java_3;

import java.util.Scanner;

public class exercicio_3 {
	public static void main(String[] args) {
		Scanner s;
		s = new Scanner (System.in);
		//3. Leia dois números diferentes e informe qual deles é o maior.
		
		int a, b;
		System.out.println("Digite o valor de A");
		a = s.nextInt();
		System.out.println("Digite o valor de B");
		b = s.nextInt();
		if(a > b) {
		System.out.println("A é maior que B");
		}else {
		System.out.println("B é maior que A");
		}

	}
}
