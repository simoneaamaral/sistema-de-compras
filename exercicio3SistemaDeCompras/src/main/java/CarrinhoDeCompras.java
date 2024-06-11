import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Produtos> produtos;
    private double total = 0;


    public CarrinhoDeCompras() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produtos produto) {
        produtos.add(produto);
    }

    private double calcularTotal() {
        for (Produtos produto : produtos) {
            total += produto.subtotal();
        }
        return total;
    }

    public void listarProdutos(){
        System.out.println("Produdo\t\t\tValor Unitário \t Quantidade\t\t\tSub-total ");
        for (Produtos produto : produtos) {
            System.out.println(produto);
        }
        System.out.format("\t\t\t\t\t\t\t\t\t Total a pagar: R$%.2f" , calcularTotal());

    }

}

