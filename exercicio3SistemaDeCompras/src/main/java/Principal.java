public class Principal {

    public static void main(String[] args) {
        Produtos p1 = new Produtos("Mesa", 150.00,1);
        Produtos p2 = new Produtos("Cadeira", 40.00,4);
        Produtos p3 = new Produtos("Prato", 12.50,10);
        Produtos p4 = new Produtos("Panela", 40,2);
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarProduto(p1);
        carrinho.adicionarProduto(p2);
        carrinho.adicionarProduto(p3);
        carrinho.adicionarProduto(p4);

        carrinho.listarProdutos();

    }

}
