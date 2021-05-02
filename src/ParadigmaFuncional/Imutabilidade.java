package ParadigmaFuncional;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Imutabilidade {

    public static void main(String[] args) {
        int valor = 20;
        UnaryOperator<Integer> retornarDobro = v -> v* 2; //Não altera a variavel original;
        System.out.println(retornarDobro.apply(valor));
        System.out.println(valor);
    }



}
