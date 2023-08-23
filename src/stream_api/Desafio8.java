package stream_api;

import java.util.List;

public class Desafio8 {
    public static void solucao(List<Integer> numeros) {
        /* Desafio 8 - Somar os dígitos de todos os números da lista:
        Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.*/
        System.out.println("Desafio 8");

        int soma = numeros.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("A soma dos números da lista é: " + soma);
    }
}
