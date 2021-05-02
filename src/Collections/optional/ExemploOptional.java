package Collections.optional;

import java.util.Optional;

public class ExemploOptional {
    public static void main(String[] args) {
        Optional<String> optionalString = Optional.of("Valor Opcional");

        System.out.println(Optional.ofNullable("Carla").get());

        Optional<Object> empty = Optional.empty();

        System.out.println(empty.get());

        System.out.println(optionalString.isEmpty());

        optionalString.ifPresentOrElse(System.out::println, ()-> System.out.println("Não Está presente"));

        optionalString.ifPresent(System.out::println);

        if (optionalString.isPresent()){
            String x = optionalString.get();
            System.out.println(x);
        }

        Optional<String> optionalS = optionalString.map(s -> s + "Concatenado"); //Transforma em outro optional
        System.out.println(optionalS.get());
    }
}
