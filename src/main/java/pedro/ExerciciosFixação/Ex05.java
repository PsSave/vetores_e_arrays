package pedro.ExerciciosFixação;

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, posicao;
        n = sc.nextInt();
        posicao = 0;
        double maior = 0;
        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();

            if(vect[i] > maior){
                maior = vect[i];
                posicao = i;
            }
        }

        System.out.println("Maior valor = " + maior);
        System.out.println("POSICAO DO MAIOR VALOR = " + posicao);
        sc.close();
    }
}
