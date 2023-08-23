package stream_api;

import java.util.List;

public class Desafio9 {
    public static void solucao(List<Integer> numeros) {
        /* Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
        Com a Stream API, verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no
        console.*/
        System.out.println("Desafio 9");

        List<Integer> numerosDistintos = numeros.stream()
                .distinct()
                .toList();
        boolean saoDistintos = numeros.size() == numerosDistintos.size();
        System.out.println("Todos os números da lista são distintos? " + saoDistintos);
    }
}
