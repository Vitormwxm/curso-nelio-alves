package entities;

public class CalculadoraBinaria {
    private static int item;
    private int[] lista;

    public CalculadoraBinaria(int item, int[] lista) {
        this.item = item;
        this.lista = lista;
    }

    public CalculadoraBinaria() {
    }

    public Integer pesquisaBinaria(int[] lista, int item) {
        int baixo = 0;
        int alto = lista.length - 1;

        while (baixo <= alto) {
            int meio = (baixo + alto) / 2;
            int chute = lista[meio];

            if (chute == item) {
                return meio;
            }

            if (chute > item) {
                alto = meio - 1;
            } else {
                baixo = meio + 1;
            }

        }

        return null;
    }

    public int getItem() {
        return item;
    }

    public int[] getLista() {
        return lista;
    }
}
