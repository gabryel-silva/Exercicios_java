package Exercícios_java_3;

import java.util.Scanner;

public class exercicio_4 {
	public static void main(String[] args) {
		Scanner s;
		s = new Scanner(System.in);
		
		//4.Leia o nome e quatro notas de um aluno durante o semestre,calcula a média aritmética.
		
		float n1, n2, n3, n4, nf;
		
		System.out.println("Digite a nota n1:");
		n1 = s.nextFloat();
		
		System.out.println("Digite a nota n2:");
		n2 = s.nextFloat();
		
		System.out.println("Digite a nota n3:");
		n3 = s.nextFloat();
		
		System.out.println("Digite a nota n4");
		n4 = s.nextFloat();
		
		nf = (n1 + n2 + n3 +n4)/4;
		
		System.out.printf("Sua nota final é %.1f", nf);

	}
}