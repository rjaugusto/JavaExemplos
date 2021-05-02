package InterfacesFuncionais;

import java.util.function.Function;

//São Interfaces Funcionais que recebem um parametro e também RETORNAM um parãmetro
public class Functions {

    public static void main(String[] args) {
        //O primeiro argumento é a entrada, o segundo argumento é o tipo de retorno
        Function<String,String> retornaNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
        Function<String,Integer> converteStringParaInterio = Integer::valueOf;

        System.out.println(retornaNomeAoContrario.apply("Rafael"));
        System.out.println(converteStringParaInterio.apply("20"));

    }
}
