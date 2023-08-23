package stream_api;


import java.util.List;


public class Desafio6 {
    public static void solucao(List<Integer> numeros) {
        /* Desafio 6 - Verificar se a lista contém algum número maior que 10:
        Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.*/
        System.out.println("Desafio 6");

        boolean existeMaiorQueDez = numeros.stream()
                .anyMatch(n -> n > 10);
        System.out.println(existeMaiorQueDez);
    }
}
