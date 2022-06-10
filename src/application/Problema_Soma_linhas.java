package application;

import java.util.Scanner;

public class Problema_Soma_linhas {

	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			
			System.out.print("Qual a quantidade de linhas da matriz? ");
				byte M = scan.nextByte();
			System.out.print("Qual a quantidade de colunas da matriz? ");
				byte N = scan.nextByte();
				
			if(N > 10 || M > 10) {
				System.out.println("Erro! Valor acima de 10!");
				System.exit(0);
			}
				
			double matriz[][] = new double[M][N], vetor[] = new double[M];	
			
			
			for(int x = 0; x < matriz.length; x++) {
				System.out.printf("Digite os elementos da %dª linha:\n", x + 1);
				for(int y = 0; y < matriz[x].length; y++) {
					matriz[x][y] = scan.nextDouble();
					vetor[x] += matriz[x][y];
				}
			}
			scan.close();
			
			System.out.println("VETOR GERADO:");
			for(int x = 0; x < vetor.length; x++) {
				System.out.println(vetor[x]);
			}
				
				
	}

}
