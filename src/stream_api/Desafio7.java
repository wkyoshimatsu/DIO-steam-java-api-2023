package stream_api;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Desafio7 {
    public static void solucao(List<Integer> numeros) {
        /* Desafio 7 - Encontrar o segundo número maior da lista:
        Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.*/
        System.out.println("Desafio 7");

        List<Integer> numerosCopiados = numeros.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .toList();
        int segundoMaior = numerosCopiados.get(1);
        System.out.println(segundoMaior);
    }
}
