public class Produtos {
    private String nome;
    private double preco;
    private int quant;

    public Produtos(String nome, double preco, int quant) {
        this.nome = nome;
        this.preco = preco;
        this.quant = quant;

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

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public double subtotal(){
        return preco * quant;
    }

    public String toString() {
        return String.format("%s\t\t\tR$ %.2f\t\t\t %d\t\t\t\tR$%.2f", nome, preco, quant, subtotal());
    }
}
