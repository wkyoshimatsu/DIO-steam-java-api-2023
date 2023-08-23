package stream_api;

import java.util.List;

public class Desafio12 {
    public static void solucao(List<Integer> numeros) {
        /* Desafio 12 - Encontre o produto de todos os números da lista:
        Com a ajuda da Stream API, encontre o produto de todos os números da lista e exiba o resultado no console.*/
        System.out.println("Desafio 12");

        int produto = numeros.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println("O produto dos números é: " + produto);
    }
}
