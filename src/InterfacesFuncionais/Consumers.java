package InterfacesFuncionais;

import java.util.function.Consumer;

public class Consumers {

    public static void main(String[] args) {
        //Consumer é uma interface funciona que recebe um parâmetro e não retorna nada

        Consumer<String> imprimeUmaFrase = frase -> System.out.println(frase);
        Consumer<String> imprimeUmaFraseComMethodReference = System.out::println;

        imprimeUmaFrase.accept("Frase impressa");
        imprimeUmaFraseComMethodReference.accept("Frase impressa com Method Reference");
    }

}
