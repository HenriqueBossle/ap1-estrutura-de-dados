import java.util.Random;

public class Matriz {
    private int linhas;
    private int colunas;
    private int[][] matriz;



    public Matriz(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.matriz = new int[linhas][colunas];
    }

    public void inserirManualmente(int linha, int coluna, int valor) {
        if (linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas) {
            matriz[linha][coluna] = valor;
        } else {
            System.out.println("Posição inválida!");
        }
    }

    public void preencheMatriz(int max) {
        Random r = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = r.nextInt(100);
            }
        }
    }

    public void mostrarMatriz() {
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public void removerElemento(int linha, int coluna) {
        matriz[linha][coluna] = 0;
    }
//ordenar por linha bubblesort
    public void ordenarPorLinhaBubble(int[] linha) {
        int n = linha.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (linha[j] > linha[j + 1]) {
                    int temp = linha[j];
                    linha[j] = linha[j + 1];
                    linha[j + 1] = temp;
                }
            }
        }
    }

    public void bubbleSortPorLinha(){
        for (int i = 0; i < linhas - 1; i++) {
            ordenarPorLinhaBubble(matriz[i]);
        }
    }

    //ordenar por linha quick sort

    public static void quickSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int indicePivo = particionar(vetor, inicio, fim);
            quickSort(vetor, inicio, indicePivo - 1);
            quickSort(vetor, indicePivo + 1, fim);
        }
    }

    private static int particionar(int[] vetor, int inicio, int fim) {
        int pivo = vetor[fim];
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            if (vetor[j] <= pivo) {
                i++;
                int temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
            }
        }

        int temp = vetor[i + 1];
        vetor[i + 1] = vetor[fim];
        vetor[fim] = temp;

        return i + 1;
    }

    public void quickSortPorLinhas() {
        for (int i = 0; i < linhas; i++) {
            quickSort(matriz[i], 0, colunas - 1);
        }
    }

    //ordenar por coluna bubblesort
    public void ordenarPorColunaBubble(int[] coluna) {
        int n = coluna.length;
        for (int j = 0; j < n - 1; j++) {
            for (int i = 0; i < n - j - 1; i++) {
                if (coluna[i] > coluna[i + 1]) {
                    int temp = coluna[i];
                    coluna[i] = coluna[i + 1];
                    coluna[i + 1] = temp;
                }
            }
        }
    }

    public void bubbleSortPorColuna() {
        for (int j = 0; j < colunas; j++) {
            int[] colunaTemp = new int[linhas];

            // Extrair coluna j
            for(int i = 0; i < linhas; i++){
                colunaTemp[i] = matriz[i][j];
            }

            // Ordenar a coluna
            ordenarPorColunaBubble(colunaTemp);

            // Colocar de volta na matriz
            for (int i = 0; i < linhas; i++){
                matriz[i][j] = colunaTemp[i];
            }
        }
    }

    private void insertionSort(int[] array) {
        int n = array.length;


        for (int i = 1; i < n; i++) {
            int primeiroValor = array[i];
            int j = i - 1;


            while (j >= 0 && array[j] > primeiroValor) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = primeiroValor;
        }
    }

    public void insertionSortMatrizCompleta() {

        int totalElementos = linhas * colunas;
        int[] arrayTemp = new int[totalElementos];


        int index = 0;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                arrayTemp[index++] = matriz[i][j];
            }
        }

        insertionSort(arrayTemp);

        index = 0;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = arrayTemp[index++];
            }
        }
    }
}

