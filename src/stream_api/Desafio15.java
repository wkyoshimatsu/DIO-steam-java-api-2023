package stream_api;

import java.util.List;

public class Desafio15 {
    public static void solucao(List<Integer> numeros) {
        /* Desafio 15 - Verifique se a lista contém pelo menos um número negativo:
        Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo e exiba o resultado no console.*/
        System.out.println("Desafio 15");

        boolean temNegativo = numeros.stream()
                        .anyMatch(n -> n < 0);
        System.out.println("Existe algum número negativo? " + temNegativo);
    }
}
