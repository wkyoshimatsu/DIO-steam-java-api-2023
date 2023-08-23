package stream_api;

import java.util.List;
import java.util.function.Consumer;

public class Desafio13 {
    public static void solucao(List<Integer> numeros, int minimo, int maximo) {
        /* Desafio 13 - Filtrar os números que estão dentro de um intervalo:
        Utilize a Stream API para filtrar os números que estão dentro de um intervalo específico (por exemplo, entre 5
        e 10) e exiba o resultado no console.*/
        System.out.println("Desafio 13");

        System.out.print("A lista dos números que estão entre " + minimo + " e " + maximo + ": ");
        numeros.stream()
                .filter(numero -> numero >= minimo && numero <= maximo)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();
    }
}
