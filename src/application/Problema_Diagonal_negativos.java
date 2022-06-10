package application;

import java.util.Scanner;

public class Problema_Diagonal_negativos {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
			System.out.printf("Qual a ordem da matriz? ");
				int n = scan.nextInt();
				int matriz[][] = new int[n][n], diagonal[] = new int[n], negativos = 0;
				
				if(n > 10) {
					System.out.println("Erro! Valor acima de 10!");
					System.exit(0);
				}
				
			for(int x = 0; x < matriz.length; x++) {
				for(int y = 0; y < matriz[x].length; y++) {
					System.out.printf("Elemento [%d,%d]: ", x, y);
						matriz[x][y] = scan.nextInt();
						
						if(x == y) {
							diagonal[y] = matriz[x][y];
						}
						if(matriz[x][y] < 0) {
							negativos++;
						}	
						
				}
			}
			 scan.close();
			
			System.out.println("DIAGONAL PRINCIPAL: ");
			 for(int i = 0; i < diagonal.length; i++) {
				 System.out.printf("%d ", diagonal[i]);
			 }
			 	System.out.printf("\nQUANTIDADE DE NEGATIVOS = %d", negativos);
			
	}

}
