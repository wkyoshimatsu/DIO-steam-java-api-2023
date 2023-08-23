package stream_api;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Desafio16 {
    public static void solucao(int numero) {
        /* Desafio 16 - Calcule o fatorial de um número:
        Crie um programa que receba um número inteiro como entrada e, utilizando a Stream API, calcule o fatorial desse
        número e exiba o resultado no console.*/
        System.out.println("Desafio 16");

        int fatorial = IntStream
                .rangeClosed(1, numero)
                .reduce(1, (a, b) -> a * b);

        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }
}
