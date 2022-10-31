package pedro.Listas.objeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Empregado> list = new ArrayList<>();

        System.out.print("Digite a quantidade de empregados: ");
        int n = sc.nextInt();

        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println("Empregado #" + i + ": ");
            
            System.out.print("Id: ");
            int id = sc.nextInt();
            while(hasId(list, id)){
                System.out.print("Esse id já foi inserido, tente outro: ");
                id = sc.nextInt();    
            }
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salario: ");
            double salario = sc.nextDouble();

            list.add(new Empregado(id, nome, salario));
        }

        System.out.println();
        System.out.println("Entre com o id do empregado que tera o salario aumentado: ");
        int id = sc.nextInt();
        Empregado emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
            if (emp == null) {
                System.out.println("Id não existente");
            } else {
                System.out.print("Entre com a porcentagem: ");
                double porcentagem = sc.nextDouble();
                emp.incrementoSalarial(porcentagem);
            }
        
        System.out.println();
        System.out.println("Lista de empregados: ");
        for (Empregado empregados : list) {
            System.out.println(empregados);
        }


        sc.close();
    }

    private static boolean hasId(List<Empregado> list, int id) {
        Empregado emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
