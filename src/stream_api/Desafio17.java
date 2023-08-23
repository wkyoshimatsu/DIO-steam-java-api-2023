package stream_api;

import java.util.List;

public class Desafio17 {
    public static void solucao(List<Integer> numeros) {
        /* Desafio 17 - Agrupe os números em pares e ímpares:
        Utilize a Stream API para agrupar os números em duas listas separadas, uma contendo os números pares e outra
        contendo os números ímpares da lista original, e exiba os resultados no console.*/
        System.out.println("Desafio 17");

        List<Integer> pares = numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .toList();
        List<Integer> impares = numeros.stream()
                .filter(numero -> numero % 2 != 0)
                .toList();
        System.out.println("A lista dos números pares é: " + pares);
        System.out.println("A lista dos números ímpares é: " + impares);
    }
}
