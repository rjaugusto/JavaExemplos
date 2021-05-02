package ParadigmaFuncional;

import java.util.Arrays;
import java.util.function.UnaryOperator;

public class ImperativoVsFuncional {
    public static void main(String[] args) {
        //Imperativo, a instrução executa de forma imperativa/instatânea
        int valor = 10;
        int resultado = valor * 3;
        System.out.println("O resultado é: " +resultado);

        //Funcional, é declarado o comportamento antes do uso
        UnaryOperator<Integer> calculaValorVezes3 = valorFuncional -> valorFuncional*3;
        System.out.println("O resultado é: " +calculaValorVezes3.apply(10));

        //Composição de funções

        int[] valores = {1,2,3,4,5,6};

        Arrays.stream(valores)
                .filter(numero -> numero % 2 == 0)
                .map(numero -> numero *2)
                 .forEach(System.out::println);
    }

}
