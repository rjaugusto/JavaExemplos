package Collections.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExemplosStreamAPI {

    public static void main(String[] args) {
        List<String> estudantes = new ArrayList<>();

        estudantes.add("Pedroa");
        estudantes.add("Thaysea");
        estudantes.add("Marceloa");
        estudantes.add("Carla");
        estudantes.add("Julianas");
        estudantes.add("Thiago");
        estudantes.add("Rafael");

        System.out.println("Contagem: " + estudantes.stream().count());

        System.out.println("Maior Número de Letras: " + estudantes.stream().max(Comparator.comparingInt(String::length)));

        System.out.println("Menor Número de Letras: " + estudantes.stream().min(Comparator.comparingInt(String::length)));

        //Filter, retorna uma nova lista apartir de filtro definido
        var menoresQueCinco = estudantes.stream().filter(e -> e.length() <= 5).collect(Collectors.toList());
        System.out.println(menoresQueCinco);

        //Transforma uma lista em uma nova lista com o mesmo número de elementos modificados
        var TransformaEmMaiusculas = estudantes.stream().map(e -> "-" + e.toUpperCase() + "-").collect(Collectors.toList());
        System.out.println(TransformaEmMaiusculas);

        var collectPeek = estudantes.stream().peek(e -> System.out.println(e + "PEEK")).collect(Collectors.toList());
        System.out.println(collectPeek);

        //AllMatch...se todos elementos retornarem true o retorno da expressão é true
        boolean c = estudantes.stream().allMatch(e -> e.contains("a"));
        System.out.println(c);
        //Any Match...se no mpinimo um elemento retornar true a expressão retorna true
        boolean d = estudantes.stream().anyMatch(e -> e.contains("R"));
        System.out.println(d);

        //None Match...se todas os elementos retornarem falso, ele retorna TRUE
        boolean z = estudantes.stream().noneMatch(e -> e.contains("Z"));
        System.out.println(z);

        //RetornaO Primeiro elemento
        estudantes.stream().findFirst().ifPresent(System.out::println);

        //Operação Encadeada

        var r = estudantes.stream()
                .peek(System.out::println)
                .map(e -> e.concat("-" + e + "-"))
                .peek(System.out::println)
                .filter(e -> e.toLowerCase().contains("r"))
                .collect(Collectors.groupingBy(String::length));

        System.out.println(r);

    }
}
