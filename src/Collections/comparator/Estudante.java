package Collections.comparator;

//a interface Compareble permite agente ordenar o objeto de dominio da nossa aplicação
public class Estudante implements Comparable<Estudante>{

    private final String nome;
    private final Integer idade;

    public Estudante(String nome,Integer idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return nome + "-" + idade;
    }

    // se o número retornado for Maior que zero significa que o proximo elemento comparado e maior que o atual
    // se o número retornado for Menor que zero significa que o proximo elemento cpmparado é menor que o atual
    // se o numero retornado for Zero, significa que é o mesmo elemento
    @Override
    public int compareTo(Estudante o) {
        return this.getIdade() - o.getIdade();
    }
}
