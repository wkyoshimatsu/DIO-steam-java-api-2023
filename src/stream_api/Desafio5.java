package stream_api;


import java.util.List;
import java.util.OptionalDouble;

public class Desafio5 {
    public static void solucao(List<Integer> numeros){
        /* Desafio 5 - Calcule a média dos números maiores que 5:
        Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.*/
        System.out.println("Desafio 5");

        OptionalDouble mediaMaioresQueCinco = numeros.stream()
                .filter(n -> (n > 5))
                .mapToDouble(Integer::doubleValue)
                .average();
        System.out.println("A média dos números maiores que 5 é: " + mediaMaioresQueCinco);
    }
}
