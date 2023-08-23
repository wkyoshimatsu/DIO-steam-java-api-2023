package stream_api;

import java.util.List;

public class Desafio20 {
    public static void solucao(List<Integer> numeros) {
        /* Desafio 20 - Encontre a soma dos números divisíveis por 3 e 5:
        Com a Stream API, encontre a soma dos números da lista que são divisíveis tanto por 3 quanto por 5 e exiba o
        resultado no console.*/
        System.out.println("Desafio 20");

        int somaMultiplosDeTresECinco = numeros.stream()
                .filter(n -> n % 3 == 0 || n % 5 == 0)
                .mapToInt(n -> n)
                .sum();
        System.out.println("A soma dos números divisíveis por 3 e 5 é " + somaMultiplosDeTresECinco);
    }
}
