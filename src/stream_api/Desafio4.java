package stream_api;

import java.util.ArrayList;
import java.util.List;

public class Desafio4 {
    public static void solucao(List<Integer> numeros){
        /*
        Desafio 4 - Remova todos os valores ímpares:
        Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.
        */
        System.out.println("Desafio 4");
        List<Integer> numerosCopiados = new ArrayList<>(numeros);
        //numerosCopiados.remove(1);
        List<Integer> imparesParaRemover = numerosCopiados.stream()
                .filter(n -> (n % 2 != 0))
                .toList();
        numerosCopiados.removeAll(imparesParaRemover);
        System.out.println(numerosCopiados);
    }
}
