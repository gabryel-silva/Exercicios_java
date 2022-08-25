package Exercícios_java;

	import java.util.Scanner;
	
		public class DeclaracaoVariaveis {
			
			public static void main(String[] args) {
				Scanner entrada;
				entrada = new Scanner (System.in);
				
				String nomeCarro;
				System.out.println("Digite o nome do carro");
				nomeCarro = entrada.nextLine();
				
				
				int VelocidadeMaxima;
				System.out.println("Digite a velocidade máxima do carro");
				VelocidadeMaxima = entrada.nextInt();
				
				float tempoAceleracao;
				System.out.println("Digite o tempo de aceleração do carro");
				tempoAceleracao = entrada.nextFloat();
				
				double precoCarro;
				System.out.println("Digite o preço do carro");
				precoCarro = entrada.nextDouble();
				
				System.out.println("Dados cadastrais" 
									+ "\nNome do carro: " 
									+ nomeCarro						
									+ "\nVelocidade máxima: "
									+ VelocidadeMaxima + "km/h"
									+ "\nTempo de aceleração: "
									+ tempoAceleracao + "s"
									+ "\nPrço: R$"
									+ precoCarro);
				
			}
	}
