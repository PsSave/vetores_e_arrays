package pedro.Vetores;

import java.util.Locale;
import java.util.Scanner;

public class vetores2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        VetoresObjeto[] vect = new VetoresObjeto[n]; 
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String nome = sc.nextLine();
            double preco = sc.nextDouble();
            vect[i] = new VetoresObjeto(nome, preco);
        }

        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma += vect[i].getPreco();
        }
        double avg = soma / n;

        System.out.printf("PREÇO MÉDIO: %.2f%n", avg);
        

        sc.close();
    }
}
