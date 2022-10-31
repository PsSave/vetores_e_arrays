package pedro.Matrizes;

import java.util.Scanner;

public class MatrizEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas para sua matriz: ");
        int linhas = sc.nextInt();

        System.out.println();
        System.out.print("Digite a quantidade de colunas para sua matriz: ");
        int colunas = sc.nextInt();

        int[][] matriz = new int[linhas][colunas];

        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            System.out.printf("Digite os valores da %da linha da sua matriz: \n", i + 1);
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("Sua matriz ficou posicionalda desta forma =");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][i] < 10){
                    
                }
                System.out.print(matriz[i][j]+"  ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Digite um valor para ser pesquisado na matriz: ");
        int valor = sc.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] == valor){
                    System.out.printf("\nPosicao (%d , %d):\n", i, j);
                    if(j > 0 ){
                        System.out.printf("Left: %d%n", matriz[i][j-1]);
                    }
                    if (j < matriz[i].length - 1 ) {
                        System.out.printf("Right: %d%n", matriz[i][j+1]);
                    }
                    if (i > 0){
                        System.out.printf("Up: %d%n", matriz[i-1][j]);
                    }
                    if (i < matriz.length - 1){
                        System.out.printf("Down: %d%n", matriz[i+1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}
