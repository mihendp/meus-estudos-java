import java.util.*;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class ConceitosStream {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprima todos os elementos dessa lista de String: ");
        numerosAleatorios.stream()
                .forEach(System.out::println);

        System.out.println("Pegue os 5 primeiros elementos e coloque em um Set: ");
        Set<String> collectSet = numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet());
        collectSet
                .forEach(System.out::println);

        System.out.println("Transforme essa lista de String em uma lista de inteiros: ");
        List<Integer> collectList = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        collectList
                .forEach(System.out::println);

        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista: ");
        List<Integer> listParesMaioresQueDois = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> (i % 2 == 0 && i > 2))
                .collect(Collectors.toList());
        System.out.println(listParesMaioresQueDois);

        System.out.println("Mostre a média dos números: ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("Remova os valores ímpares: ");
        collectList.removeIf(i -> (i % 2 != 0));
        System.out.println(collectList);

        System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante");
        numerosAleatorios.stream()
                .skip(3)
                .forEach(System.out::println);

        long count = numerosAleatorios.stream()
                .distinct()
                .count();
        System.out.println("Retirando os números repitidos da lista, quantos ficam? " + count);

        System.out.println("Mostre o menor valor da lista: ");
        collectList.stream()
                .mapToInt(Integer::intValue)
                .min()
                .ifPresent(System.out::println);

        System.out.println("Mostre o maior valor da lista: ");
        collectList.stream()
                .mapToInt(Integer::intValue)
                .max()
                .ifPresent(System.out::println);

    }
}
