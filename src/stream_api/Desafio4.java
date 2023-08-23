package stream_api;

import java.util.ArrayList;
import java.util.List;

public class Desafio4 {
    public static void solucao(List<Integer> numeros){
        /* Desafio 4 - Remova todos os valores ímpares:
        Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.*/
        System.out.println("Desafio 4");

        List<Integer> pares = numeros.stream()
                .filter(n -> (n % 2 == 0))
                .toList();
        System.out.println("A lista de números com os números ímpares removidos: " + pares);
    }
}
