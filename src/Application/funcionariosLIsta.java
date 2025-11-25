package Application;

import entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class funcionariosLIsta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantos funcionários serão registrados?");
        int quantidadeFuncionarios = scanner.nextInt();
        List<Funcionario> list = new ArrayList();

        for (int i = 0; i < quantidadeFuncionarios; i++) {
            System.out.println("Funcionario #" + (i + 1));

            System.out.println("Informe o id: ");
            int id = scanner.nextInt();
            System.out.println("Informe o nome");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.println("Informe o salario");
            double salario = scanner.nextDouble();

            Funcionario funcionario = new Funcionario(id, name, salario);

            list.add(funcionario);
        }

        System.out.println("Qual funcionario você quer que apareça na tela?");
        int id = scanner.nextInt();

        int position = position(list, id);
        System.out.println(list.get(position).getName() + " , " + list.get(position).getSalary());

    }

    public static int position(List<Funcionario> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
