package application;

import java.util.Scanner;

public class Problema_Soma_matrizes {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantas linhas terá em cada matriz? ");
			byte M = scan.nextByte();
		System.out.print("Quantas colunas terá em cada matriz? ");
			byte N = scan.nextByte();
			
		int matrizA[][] = new int[M][N], matrizB[][] = new int[M][N], soma[][] = new int[M][N];
	
		System.out.println("Digite os valores da matriz A:");
			for(int x = 0; x < M; x++) {			
				for(int y = 0; y < N; y++) {
					System.out.printf("Elemento [%d,%d]: ", x, y);
					matrizA[x][y] = scan.nextInt();
				}
			}
		
		System.out.println("Digite os valores da matriz B:");
			for(int x = 0; x < M; x++) {			
				for(int y = 0; y < N; y++) {
					System.out.printf("Elemento [%d,%d]: ", x, y);
					matrizB[x][y] = scan.nextInt();
				}
			}
			
		System.out.println("MATRIZ SOMA:");
			for(int x = 0; x < M; x++) {
				System.out.print("{ ");
				for(int y = 0; y < N; y++) {
					soma[x][y] = matrizA[x][y] + matrizB[x][y];
					System.out.printf("%02d ",soma[x][y]);
				}
				System.out.println("}");
			}
				
	scan.close();		
	}

}