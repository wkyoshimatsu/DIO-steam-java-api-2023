import java.util.Arrays;
import java.util.List;
import stream_api.*;

public class Main{
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        /* Desafio 1 - Mostre a lista na ordem numérica:
        Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console.*/
        Desafio1.solucao(numeros);

        /* Desafio 2 - Imprima a soma dos números pares da lista:
        Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.*/
        Desafio2.solucao(numeros);

        /* Desafio 3 - Verifique se todos os números da lista são positivos:
        Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.*/
        Desafio3.solucao(numeros);

        /* Desafio 4 - Remova todos os valores ímpares:
        Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.*/
        Desafio4.solucao(numeros);

        /* Desafio 5 - Calcule a média dos números maiores que 5:
        Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.*/
        Desafio5.solucao(numeros);

        /* Desafio 6 - Verificar se a lista contém algum número maior que 10:
        Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.*/
        Desafio6.solucao(numeros);

        /* Desafio 7 - Encontrar o segundo número maior da lista:
        Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.*/
        Desafio7.solucao(numeros);

        /* Desafio 8 - Somar os dígitos de todos os números da lista:
        Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.*/
        Desafio8.solucao(numeros);

        /* Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
        Com a Stream API, verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no
        console.*/
        Desafio9.solucao(numeros);

        /* Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
        Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.*/
        Desafio10.solucao(numeros);

        /* Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
        Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.*/
        Desafio11.solucao(numeros);

        /* Desafio 12 - Encontre o produto de todos os números da lista:
        Com a ajuda da Stream API, encontre o produto de todos os números da lista e exiba o resultado no console.*/
        Desafio12.solucao(numeros);

        /* Desafio 13 - Filtrar os números que estão dentro de um intervalo:
        Utilize a Stream API para filtrar os números que estão dentro de um intervalo específico (por exemplo, entre 5
        e 10) e exiba o resultado no console.*/
        Desafio13.solucao(numeros,3, 5);

        /* Desafio 14 - Encontre o maior número primo da lista:
        Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.*/
        Desafio14.solucao(numeros);

        /* Desafio 15 - Verifique se a lista contém pelo menos um número negativo:
        Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo e exiba o resultado no console.*/
        //Desafio15.solucao(numeros);

        /* Desafio 16 - Calcule o fatorial de um número:
        Crie um programa que receba um número inteiro como entrada e, utilizando a Stream API, calcule o fatorial desse
        número e exiba o resultado no console.*/
        //Desafio16.solucao(numeros);

        /* Desafio 17 - Agrupe os números em pares e ímpares:
        Utilize a Stream API para agrupar os números em duas listas separadas, uma contendo os números pares e outra
        contendo os números ímpares da lista original, e exiba os resultados no console.*/
        //Desafio17.solucao(numeros);

        /* Desafio 18 - Filtrar os números primos da lista:
        Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.*/
        //Desafio18.solucao(numeros);

        /* Desafio 19 - Verifique se todos os números da lista são iguais:
        Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.*/
        //Desafio19.solucao(numeros);

        /* Desafio 20 - Encontre a soma dos números divisíveis por 3 e 5:
        Com a Stream API, encontre a soma dos números da lista que são divisíveis tanto por 3 quanto por 5 e exiba o
        resultado no console.*/
        //Desafio20.solucao(numeros);
    }
}