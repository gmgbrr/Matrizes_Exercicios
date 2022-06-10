package application;

import java.util.Scanner;

public class Problema_Cada_linha {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Qual a ordem da matriz? ");
			byte N = scan.nextByte();
			
		if(N > 10) {
			System.out.println("Erro! Valor acima de 10!");
			System.exit(0);
		}				
			
		int matriz[][] = new int[N][N], maior[] = new int[N];

		
		for(int x = 0; x < matriz.length; x++) {
			for(int y = 0; y < matriz[x].length; y++) {
				System.out.printf("Elemento [%d,%d]: ", x, y);
				matriz[x][y] = scan.nextInt();
			}
		}		
		
		
		System.out.println("MAIOR ELEMENTO DE CADA LINHA:");			
		for(int x = 0; x < matriz.length; x++) {
			for(int y = 0; y < matriz[x].length; y++) {
				if(matriz[x][y] > maior[x]) {
					maior[x] = matriz[x][y];
				}					
			}
			System.out.println(maior[x]);
		}
	scan.close();
	}

}