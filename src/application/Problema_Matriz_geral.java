package application;

import java.util.Scanner;

public class Problema_Matriz_geral {

	static Scanner scan = new Scanner(System.in);
	
	static void imprimirLinha(double z[][]) {
		
		System.out.print("\n\nEscolha uma linha: ");
		byte pos = scan.nextByte();
		
		System.out.print("LINHA ESCOLHIDA: ");
		for(int x = 0; x < z.length; x++) {
			System.out.printf("%.1f ", z[pos][x]);
		}	
	}
	
	static void imprimirColuna(double z[][]) {
		
		System.out.print("\n\nEscolha uma coluna: ");
		byte pos = scan.nextByte();
		
		System.out.print("COLUNA ESCOLHIDA: ");
		for(int x = 0; x < z.length; x++) {
			System.out.printf("%.1f ", z[x][pos]);
		}	
	}
	
	static void imprimirDiagonal(double z[][]) {
		
		System.out.print("\n\nDIAGONAL PRINCIPAL: ");
		for(int x = 0; x < z.length; x++) {
			for(int y = 0; y < z[x].length; y++) {
				if(x == y) {
					System.out.printf("%.1f ", z[x][y]);
				}			
			}
		}	
	}
	
	static void alterarMatriz(double z[][]) {
		
		System.out.println("\n\nMATRIZ ALTERADA: ");
		for(int x = 0; x < z.length; x++) {
			System.out.print("{ ");
			for(int y = 0; y < z[x].length; y++) {
				if(z[x][y] < 0) {
					z[x][y] = Math.pow(z[x][y], 2);
				}
				System.out.printf("%.1f ", z[x][y]);
			}
			System.out.println("}");
		}
	}
	
	public static void main(String[] args) {

		
		System.out.print("Qual a ordem da matriz? ");
			byte N = scan.nextByte();
			
		if (N > 10) {
			System.out.println("Erro! Valor acima de 10");
			System.exit(0);
		}
		
		double matriz[][] = new double[N][N], soma = 0;
		
		for(int x = 0; x < matriz.length; x++) {
			for(int y = 0; y < matriz[x].length; y++) {
				System.out.printf("Elemento [%d,%d]: ", x, y);
				matriz[x][y] = scan.nextDouble();
				
				if(matriz[x][y] > 0) {
					soma += matriz[x][y];
				}
			}
		}
				
		System.out.printf("\nSOMA DOS POSITIVOS: %.1f", soma);
		
		imprimirLinha(matriz);
		
		imprimirColuna(matriz);
		
		imprimirDiagonal(matriz);
		
		alterarMatriz(matriz);
						
	}

}
