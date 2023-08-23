package stream_api;

import java.util.List;

public class Desafio19 {
    public static void solucao(List<Integer> numeros) {
        /* Desafio 19 - Verifique se todos os números da lista são iguais:
        Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.*/
        System.out.println("Desafio 19");

        List<Integer> numerosDistintos = numeros.stream()
                .distinct()
                .toList();
        boolean saoIguais = numerosDistintos.size() == 1;
        System.out.println("Todos os números da lista são iguais? " + saoIguais);
    }
}
