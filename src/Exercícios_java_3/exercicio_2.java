package Exercícios_java_3;

import java.util.Scanner;

public class exercicio_2 {
	public static void main(String[] args) {
		Scanner s;
		s = new Scanner (System.in);
		
		//2. Leia dois números e informa se os mesmos são iguais ou diferentes.
		
		int a, b;
		
		System.out.println("Digite o valor de A");
		a = s.nextInt();
		
		System.out.println("Digite o valor de B");
		b = s.nextInt();
		
		if(a == b) {
			System.out.println("A é igual a B");
		}else {
			System.out.println("A é diferente a B");
		}

	}
}
