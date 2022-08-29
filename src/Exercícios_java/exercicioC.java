package Exercícios_java;

	import java.util.Scanner;
		
		public class exercicioC {
			
				/*
			 	Desenvolva um programa em Java que lê o nome de um vendedor, o salário base dele e o total
				de vendas efetuadas em um mês. Em seguida o programa deverá mostrar o salário total deste
				vendedor no final do mês. Obs: o vendedor ganha 5% em cima do total das vendas.
				*/

				
				public static void main(String[] args) {
				
				Scanner s;
				s = new Scanner(System.in);
				
				String nomeVendedor;
				double salarioBase, valorMedioVendas, salarioTotal;
				int totalVendasMes;
				float comissao, totalComissao;
				
				
				System.out.println("Digite o nome do vendedor: ");
				nomeVendedor = s.nextLine();
					
				System.out.println("Digite o sálario base deste vendedor: ");
				salarioBase = s.nextDouble();
				
				System.out.println("Digite o total de vendas no mês: ");
				totalVendasMes = s.nextInt();
					
				System.out.println("Digite o valor médio das vendas: ");
				valorMedioVendas = s.nextDouble();
				
				comissao = 0.05f;
				
				totalComissao = (float)((valorMedioVendas * totalVendasMes) * comissao);
				System.out.println("Total da comissão R$ " + totalComissao);
				
				salarioTotal = salarioBase + totalComissao;
				
				System.out.printf("O Sálario de "
									+ nomeVendedor
									+ " é R$ %.2f",salarioTotal);
				
			}
		}
