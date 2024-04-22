package interfatec.ordenacaoClasse;


public class Produto implements Comparable<Produto> {
    @Override
    public int compareTo(Produto p) {
        if(this.getPreco() < p.getPreco()) return -1;
        if(this.getPreco() > p.getPreco()) return 1;
        return 0;
    }

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
