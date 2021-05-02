package Collections.comparator;

public class Carro implements Comparable<Carro>{

    private String nome;
    private int preco;

    public Carro(int preco,String nome){
        this.preco = preco;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    @Override
    public int compareTo(Carro o) {
        System.out.println(o.preco - this.preco);
        return this.preco -o.preco;
    }

    public int getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }
}
