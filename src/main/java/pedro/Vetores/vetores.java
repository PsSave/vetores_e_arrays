package pedro.Vetores;

import java.util.Locale;
import java.util.Scanner;

public class vetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        double[] vects = new double[n];

        for (int i = 0; i < n; i++) {
            vects[i] = sc.nextDouble();
        }

        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma += vects[i];
        }
        double avg = soma / n;

        System.out.printf("ALTURA MÉDIA: %.2f%n", avg);

        sc.close();
    }
}
