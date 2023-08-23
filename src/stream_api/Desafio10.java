package stream_api;

import java.util.List;

public class Desafio10 {
    public static void solucao(List<Integer> numeros) {
        /* Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
        Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.*/
        System.out.println("Desafio 10");

        System.out.print("A lista dos números ímpares multiplos de 3 ou de 5 é: ");
        numeros.stream()
                .filter(n -> n % 2 != 0 && (n % 3 == 0 || n % 5 == 0))
                .forEach(n -> System.out.print(n + " "));
        System.out.println();
    }
}
