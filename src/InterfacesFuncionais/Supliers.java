package InterfacesFuncionais;

import java.util.function.Supplier;

public class Supliers {
    public static void main(String[] args) {
        Supplier<Pessoa> supplier = Pessoa::new;

        System.out.println(supplier.get());
    }
}

class Pessoa{
    private String nome;
    private Integer idade;

    public Pessoa() {
       this.nome = "Joao";
        this.idade = 23;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade='" + idade + '\'' +
                '}';
    }
}
