package pedro.Matrizes;

// i = linhas da matriz
// j = colunas da matriz
public class ProgramaMatriz {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        int contador = 1;
        int soma = 0;
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                matriz[linha][coluna] = contador;
                contador++;
                soma += matriz[linha][coluna];
            }          
        }

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                if(matriz[linha][coluna] < 10){
                    System.out.print(" "+matriz[linha][coluna]+"  ");
                } else {
                    System.out.print(matriz[linha][coluna]+"  ");
                }
            }
            System.out.println();
        }

        
        System.out.println("Diagonal principal");
        for (int linha = 0; linha < matriz.length; linha++) {
            System.out.print(matriz[linha][linha] + "  ");
        }

        System.out.println();
        System.out.println("Diagonal secundaria");
        for (int linha = 0; linha < matriz.length; linha++) {
           for (int coluna = matriz.length-1; coluna >= 0; coluna--) { //(coluna = matriz.length-1)
                System.out.print(matriz[linha][coluna]+"  ");
                linha++;
           } 
           System.out.println();
        }
        System.out.println();
        System.out.println("Soma = " + soma);
        double media = soma/Math.pow(matriz.length, 2);
        System.out.println("Media = " + media);
    }
}
