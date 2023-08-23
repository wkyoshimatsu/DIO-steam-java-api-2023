package stream_api;

import java.util.List;

public class Desafio3 {
    public static void solucao(List<Integer> numeros){
        /* Desafio 3 - Verifique se todos os números da lista são positivos:
        Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.*/
        System.out.println("Desafio 3");

        boolean todosPositivos = numeros.stream()
                .allMatch(n -> (n >= 0));
        System.out.println(todosPositivos);
    }
}
