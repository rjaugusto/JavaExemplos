package ParadigmaFuncional;

import java.util.function.BiPredicate;

public class FuncoesPuras {
// Sempre retorna o mesmo valor se passado os mesmos parametros
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> verificarSeEMAior = (parametro , valorComparacao) -> parametro > valorComparacao;

        System.out.println(verificarSeEMAior.test(13,12));
        System.out.println(verificarSeEMAior.test(13,12));
    }
}
