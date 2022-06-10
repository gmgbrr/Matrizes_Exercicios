package application;

import java.util.Scanner;

public class Problema_Acima_diagonal {

	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		
			System.out.print("Qual a ordem da matriz? ");
				byte N = scan.nextByte();
				
			if (N > 10) {
				System.out.println("Erro! Valor acima de 10");
				System.exit(0);
			}
			
			int matriz[][] = new int[N][N], soma = 0;
			
			for(int x = 0; x < matriz.length; x++) {
				for(int y = 0; y < matriz[x].length; y++) {
					System.out.printf("Elemento [%d,%d]: ", x, y);
					matriz[x][y] = scan.nextInt();
						if(y > x) {
							soma += matriz[x][y];
						}
				}
			}
			
			System.out.printf("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = %d", soma);
		scan.close();
	}

}
