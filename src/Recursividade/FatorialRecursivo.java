package Recursividade;
//* Recursividade
//    - Uma função chama a si mesma repetidamente até atingir uma condição de parada.
//    No caso do Java, um método chama a si mesmo passando para si objetos primitivos.
//    Cada Chamada gera uma nova entrada na pilha de execução,
//    e alguns dados podem ser disponibilizados em um escopo globa ou local através de parâmetros em um escopo global ou loca

public class FatorialRecursivo {
    public static void main(String[] args) {
        System.out.println(fatorial(5));
    }

    public static int fatorial(int value){
        if(value == 1){
            return value;
        }else{
            return value * fatorial((value -1));
        }
    }
}
