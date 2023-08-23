package stream_api;


import java.util.List;

public class Desafio2 {
    public static void solucao(List<Integer> numeros){
        /*
        Desafio 2 - Imprima a soma dos números pares da lista:
        Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.
        */
        System.out.println("Desafio 2");
        int somaPares = numeros.stream()
                .filter(n -> (n % 2) == 0)
                .reduce(0, Integer::sum);
        System.out.println(somaPares);
    }
}
