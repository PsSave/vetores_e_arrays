package pedro.ExerciciosFixação;

import java.util.Locale;
import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos quartos você quer alugar? " );
        int n = sc.nextInt();

        ex12Objeto[] vect = new ex12Objeto[10];
        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.printf("Aluguel #%d%n", i + 1);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Quarto: ");
            int quartoAlugado = sc.nextInt();

            vect[quartoAlugado] = new ex12Objeto(nome, email);
        }

        System.out.println();
        System.out.println("Quartos alugados: ");
        for (int i = 0; i < 10; i++) {
            if(vect[i] != null){
                System.out.println(i + ": " + vect[i]);
            }
        }
        sc.close();
    }
}
