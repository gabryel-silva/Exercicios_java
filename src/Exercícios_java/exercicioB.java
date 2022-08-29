package Exercícios_java;

	import java.util.Scanner;
	
		public class exercicioB {
			public static void main(String[] args) {
				Scanner s;
				s = new Scanner(System.in);
				
				/*
				Desenvolva um programa em Java que lê quatro valores (A, B, C e D), calcula e mostra a
				diferença entre o produto de A e B e do produto de C e D.
				Resultado = (A*B) – (C*D)
				*/
				
				int A, B, C, D, mutiplicaAB, mutiplicaCD, resutadoDiferenca;
				
				System.out.println("Digite o valor do produto A:");
				A = s.nextInt();
				
				System.out.println("Digite o valor do produto B:");
				B = s.nextInt();
				
				System.out.println("Digite o valor do produto C:");
				C = s.nextInt();
				
				System.out.println("Digite o valor do produto D:");
				D = s.nextInt();
				
				mutiplicaAB = A * B;
				mutiplicaCD = C * D;
				
				resutadoDiferenca = mutiplicaAB - mutiplicaCD;
				System.out.printf("Resultado final da diferença dos produtos é %2d",resutadoDiferenca);
				
			}
		}
