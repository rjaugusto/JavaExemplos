package Collections.optional;

import java.util.Optional;

public class ExemploOptionalEstados {

    public static void main(String[] args) {
        Optional<String> optionalString = Optional.of("Valor Presente");

        System.out.println("Valor opcional que está presente");
        optionalString.ifPresentOrElse(System.out::println,() -> System.out.println("Não está presente"));

        Optional<String> optionalStringNull = Optional.ofNullable(null);
        optionalStringNull.ifPresentOrElse(System.out::println,() -> System.out.println("Não está presente"));

        Optional<String> optionalStringEmpty = Optional.empty();
        optionalStringEmpty.ifPresentOrElse(System.out::println,() -> System.out.println("Não está presente"));


    }
}
