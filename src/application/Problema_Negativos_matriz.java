package application;

import java.util.Scanner;

public class Problema_Negativos_matriz {

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
								
			int matriz[][] = new int[M][N];
				
			for(int x = 0; x < matriz.length; x++) {
				for(int y = 0; y < matriz[x].length; y++) {
					System.out.printf("Elemento [%d,%d]: ", x, y);
					matriz[x][y] = scan.nextInt();

				}
			}
			
			System.out.println("VALORES NEGATIVOS:");
			for(int x = 0; x < matriz.length; x++) {
				for(int y = 0; y < matriz[x].length; y++) {
					if(matriz[x][y] < 0) {
						System.out.println(matriz[x][y]);
					}
				
				
				}					
			}
		scan.close();
	}

}
