package Exercícios_java;

	import java.util.Scanner;
	
		public class exercicioD {
			public static void main(String[] args) {
				Scanner s;
				s = new Scanner(System.in);
				 
				 /*
				 Desenvolva um programa em java que lê o nome de um aluno e suas notas das quatro provas. O
				 programa deve mostrar o nome do aluno e a média aritmética das referidas notas.
				 média = n1+n2+n3+n4/4
				 */
				
				String nomeAluno;
				float n1, n2, n3, n4, mediaFinal;
				
				System.out.println("Digite o nome do aluno:");
				nomeAluno = s.nextLine();
				
				System.out.println("Digite a nota da primeira prova:");
				n1 = s.nextFloat();
				
				System.out.println("Digite a nota da segunda prova:");
				n2 = s.nextFloat();
				
				System.out.println("Digite a nota da terceira prova:");
				n3 = s.nextFloat();
				
				System.out.println("Digite a nota da primeira prova:");
				n4 = s.nextFloat();
				
				mediaFinal = (n1 + n2 + n3 + n4)/4;
				
				System.out.printf("O aluno "
									+ nomeAluno
									+ " tirou na media final %.1f", mediaFinal);
			}
		}
