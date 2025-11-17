package Application;

import entities.MaisVelhoEntitie;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class MaisVelho {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many people info will you enter?");
        int quantityPeopleInfo = scanner.nextInt();
        MaisVelhoEntitie[] people = new MaisVelhoEntitie[quantityPeopleInfo];

        for (int i = 0; i < people.length; i++) {
            System.out.println("Info person " + (i + 1));
            System.out.println("nome: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.println("Idade: ");
            int age = scanner.nextInt();

            people[i] = new MaisVelhoEntitie(name, age);
        }

        int maiorIdade = -1;
        String name = "";

        for (int i = 0; i < people.length; i++) {
            int age = people[i].getIdade();

            if(age > maiorIdade) {
                maiorIdade = age;
                name = people[i].getName();
            }

        }

        System.out.println("PESSOA MAIS VELHA: " + name);

    }
}
