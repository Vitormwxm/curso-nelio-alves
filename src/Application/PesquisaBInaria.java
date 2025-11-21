package Application;

import entities.CalculadoraBinaria;

import java.util.Arrays;

public class PesquisaBInaria {
    public static void main(String[] args) {

        int[] minhaLista = {1, 3, 5 , 7 , 9};
        int numero = 3;

        CalculadoraBinaria calculadoraBinaria = new CalculadoraBinaria();

        int result = calculadoraBinaria.pesquisaBinaria(minhaLista, numero);

        System.out.println(result);

        int result2 = Arrays.binarySearch(minhaLista, numero);

        System.out.println(result2);
    }
}
