package stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Desafio5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3); //NÃO CONSEGUI ALTERAR ESSA LISTA
        /*
        Desafio 5 - Calcule a média dos números maiores que 5:
        Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
        */
        System.out.println("Desafio 5");
        OptionalDouble mediaMaioresQueCinco = numeros.stream()
                .filter(n -> (n > 5))
                .mapToDouble(Integer::doubleValue)
                .average();
        System.out.println(mediaMaioresQueCinco);
    }
}
