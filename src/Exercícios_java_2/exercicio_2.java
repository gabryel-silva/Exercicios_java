package Exercícios_java_2;

	import java.util.Scanner;
		public class exercicio_2 {
			public static void main(String[] args) {
				Scanner s;
				s = new Scanner(System.in);
				
				/*Leia dois valores para as variáveis A e B e efetua a troca dos valores de forma que a
				variável A passe a ter o valor da variável B e a variável B passe a ter o valor da variável A.
				Apresente os valores trocados.*/
				
				int a, b, valorB, valorA;
				
				System.out.println("Digite o valor de A:");
				a = s.nextInt();
				
				System.out.println("Digite o valor e B:");
				b = s.nextInt();
				
				valorB = a;
				valorA = b;
				
				System.out.printf("A:%d\nB:%d",valorA,valorB);
				
			}
	}
