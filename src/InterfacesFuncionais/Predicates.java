package InterfacesFuncionais;

import java.util.function.Predicate;

//Predicates recebem um parametro e retornam um Boolean
public class Predicates {
    public static void main(String[] args) {

        Predicate<String> verificaSeEstaVazia = String::isBlank;

        System.out.println(verificaSeEstaVazia.test("Rafael"));

    }
}
