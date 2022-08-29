package Exercícios_java;

	import java.util.Scanner;
	
		public class exercicioE {
			public static void main(String[] args) {
				Scanner s;
				s = new Scanner(System.in);
				
				/*
				 Desenvolva um programa em java que lê uma temperatura em graus Celsius, converte para
		   		graus Fahrenheit e apresenta na tela, seguindo esta fórmula:
				F = 9*C + 160/5
				 */
				
				int grausC, grausF;
				
				System.out.println("Digite a temperatura em graus Celsius:");
				grausC = s.nextInt();
				
				grausF = ((9 * grausC) + 160)/5;
				
				System.out.printf("A temperatura em Fahrenheit é de " 
									+ grausF 
									+ "°F");
			}
		}
