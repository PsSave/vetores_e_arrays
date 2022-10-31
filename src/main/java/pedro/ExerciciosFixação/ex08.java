package pedro.ExerciciosFixação;

import java.util.Locale;
import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        int soma = 0;
        int ncontador = 0;
        for (int i = 0; i < n; i++) {
            if(vect[i]%2 == 0){
                soma += vect[i]; 
                ncontador++;
            }
        }

        double ma = soma / ncontador;
        if(ma > 0){
            System.out.printf("MEDIA DOS PARES = %.1f%n", ma);
        } else {
          System.out.println("NENHUM NUMERO PAR");  
        }
        
        sc.close();
    }

}
