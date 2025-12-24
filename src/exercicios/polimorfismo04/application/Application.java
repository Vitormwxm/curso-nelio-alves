package exercicios.polimorfismo04.application;

import exercicios.polimorfismo04.entities.Contribuinte;
import exercicios.polimorfismo04.entities.PessoaFisica;
import exercicios.polimorfismo04.entities.PessoaJuridica;
import exercicios.polimorfismo04.enums.TipoContribuinte;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o numero de contribuintes");
        int contribuintes = scanner.nextInt();
        scanner.nextLine();

        List<Contribuinte> list = new ArrayList<>();

        for (int i = 1; i <= contribuintes; i++) {
            System.out.printf("Dados do contribuinte #%d", i);
            System.out.println("Pessoa física ou pessoa jurídica?");
            TipoContribuinte tipoContribuinte = TipoContribuinte.valueOf(scanner.next());
            scanner.nextLine();

            System.out.println("Nome: ");
            String nome = scanner.nextLine();

            System.out.println("Renda anual");
            Double rendaAnual = scanner.nextDouble();
            if (tipoContribuinte == tipoContribuinte.PESSOA_FISICA) {
                System.out.println("Gasto com saude:" );
                Double gastoComSaude = scanner.nextDouble();

                list.add(new PessoaFisica(nome, rendaAnual, tipoContribuinte, gastoComSaude));
            } else {
                System.out.println("numero de funcionarios" );
                int quantidadeFuncionarios = scanner.nextInt();

                list.add(new PessoaJuridica(nome, rendaAnual, tipoContribuinte, quantidadeFuncionarios));
            }
        }

        System.out.println("Impostos pagos");
        for (Contribuinte x : list) {
            System.out.println(x.getNome() + ": $" + x.CalculaImposto());
        }

        Double taxaTotal = 0.0;
        for (Contribuinte x : list) {
            taxaTotal += x.CalculaImposto();
        }

        System.out.println("Taxa Total: $" + taxaTotal);


    }
}
