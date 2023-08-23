package stream_api;

import java.util.List;

public class Desafio1 {
    public static void solucao(List<Integer> numeros){
        /* Desafio 1 - Mostre a lista na ordem numérica:
        Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console.*/
        System.out.println("Desafio 1");

        System.out.print("Lista na ordem numérica: ");
        numeros.stream()
                .sorted()
                .forEach(n -> System.out.print(n + " "));
        System.out.println();
    }
}