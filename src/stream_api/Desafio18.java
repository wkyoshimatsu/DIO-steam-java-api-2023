package stream_api;

import java.util.List;

public class Desafio18 {
    public static void solucao(List<Integer> numeros) {
        /* Desafio 18 - Filtrar os números primos da lista:
        Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.*/
        System.out.println("Desafio 18");

        List<Integer> numerosPrimos = numeros.stream()
                .filter(n -> {
                    if (Math.abs(n) < 2)
                        return false;
                    for (int i = 2; i < Math.abs(n); i++) {
                        if (Math.abs(n) % i == 0)
                            return false;
                    }
                    return true;
                })
                .toList();
        System.out.println("A lista dos números primos é: " + numerosPrimos);
    }
}
