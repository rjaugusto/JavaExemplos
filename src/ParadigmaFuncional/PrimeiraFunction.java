package ParadigmaFuncional;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class PrimeiraFunction{

        public static void main(String[] args) {

            Function<String,String> imprimir = i -> imprimeString(i);

            System.out.println(imprimir.apply("O que vai ser impresso"));
        }

        public static String imprimeString (String frase){
            return frase;
        }
}
