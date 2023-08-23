package stream_api;

import java.util.List;

public class Desafio11 {
    public static void solucao(List<Integer> numeros) {
        /* Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
        Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.*/
        System.out.println("Desafio 11");

        int somaDosQuadrados = numeros.stream()
                .mapToInt(n -> n * n)
                .sum();
        System.out.println("A soma dos quadrados é: " + somaDosQuadrados);
    }
}
