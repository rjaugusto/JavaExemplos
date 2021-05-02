package InterfacesFuncionais;

import java.util.function.Function;

//É uma função que retorna uma função ou que recebe uma função como parâmetro
public class FuncaoAltaOrdem {

    public static void main(String[] args) {
        Calculo soma = (x,y)-> x+y;
        Calculo multiplica = (x,y)-> x*y;
        Calculo divide = (x,y)-> x/y;
        Calculo subtrai = (x,y)-> x-y;

        System.out.println(executarOperacao(soma,2,3));// Recebe uma função(método) como parâmetro
        System.out.println(executarOperacao(multiplica,2,3));// Recebe uma função(método) como parâmetro
        System.out.println(executarOperacao(divide,2,3));// Recebe uma função(método) como parâmetro
        System.out.println(executarOperacao(subtrai,2,3));// Recebe uma função(método) como parâmetro
    }

    public static int executarOperacao(Calculo calculo,int x, int y){
        return calculo.calcular(x,y);
    }
}

@FunctionalInterface
interface Calculo{
    public int calcular(int x,int y);
}
