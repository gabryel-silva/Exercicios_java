package Exercícios_java_3;

import java.util.Scanner;

public class exercicio_1 {
	public static void main(String[] args) {
		Scanner s;
		s = new Scanner (System.in);
		
		//1.Leia a idade de uma pessoa e mostra se a mesma é maior de idade ou não.
		
		int idade;
		
		System.out.println("Digite sua idade:\n");
		idade = s.nextInt();
		
		if(idade >= 18) {
			System.out.println("Você é maior de idade");
		}else{
			System.out.println("Você é menor de idade");
		}
	}
}
