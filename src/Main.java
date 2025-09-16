
public class Main {
    public static void main(String[] args) {
        Matriz matriz = new Matriz(3,4);

        matriz.preencheMatriz(100);

        System.out.println("Matriz inicial: ");
        matriz.mostrarMatriz();

        System.out.println("------");
        matriz.removerElemento(0,0);

        System.out.println("Removendo o primeiro elemento:");
        matriz.mostrarMatriz();
        System.out.println("------");

        System.out.println("Ordenando por linha com o Bubble Sort:");
        matriz.bubbleSortPorLinha();


        matriz.mostrarMatriz();
        System.out.println("------");
        System.out.println("Ordenando por linha com o Quick Sort:");

        matriz.quickSortPorLinhas();

        matriz.mostrarMatriz();
        System.out.println("------");
        System.out.println("Ordenando por coluna com o Bubble Sort:");

        matriz.bubbleSortPorColuna();

        matriz.mostrarMatriz();
        System.out.println("------");

        System.out.println("Ordenando a matriz inteira com o Insertion Sort:");

        matriz.insertionSortMatrizCompleta();
        matriz.mostrarMatriz();
        System.out.println("------");

        System.out.println("Insere valores manualmente em locais indicados:");

        matriz.inserirManualmente(1, 2, 900);
        matriz.mostrarMatriz();
        System.out.println("------");
        matriz.inserirManualmente(1,3,250);
        matriz.mostrarMatriz();
        System.out.println("------");
        matriz.inserirManualmente(2,3,32);
        matriz.mostrarMatriz();




    }
}
