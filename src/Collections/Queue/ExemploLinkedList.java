package Collections.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {

    //Queue/LinkedList implementa filas, o primeiro elemento que entra é o primeiro que sai
    public static void main(String[] args) {

        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Pamela");
        filaBanco.add("Patrícia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        String clienteASerAtendido = filaBanco.poll(); // retorna o primeiro elemento da fila e remove da fila

        System.out.println(clienteASerAtendido);
        System.out.println(filaBanco);

        String primeiroCliente = filaBanco.peek(); // retorna o primeiro elemento da fila e remove NÃO da fila
        System.out.println(primeiroCliente);
        System.out.println(filaBanco);

        filaBanco.clear();

        String primeiroElementoOuErro = filaBanco.element();

        System.out.println(primeiroElementoOuErro);

    }
}
