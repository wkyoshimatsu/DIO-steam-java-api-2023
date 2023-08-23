package stream_api;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Desafio14 {
    public static void solucao(List<Integer> numeros) {
        /* Desafio 14 - Encontre o maior número primo da lista:
        Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.*/
        System.out.println("Desafio 14");

        Optional<Integer> maiorPrimo = numeros.stream()
                .filter(n -> {
                    if (Math.abs(n) < 2)
                        return false;
                    for (int i = 2; i < Math.abs(n); i++) {
                        if (Math.abs(n) % i == 0)
                            return false;
                    }
                    return true;
                })
                .max(Comparator.naturalOrder());
        System.out.println("O maior número primo é: " + maiorPrimo.get());
    }
}
