//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //criando produtos
        Produto produto1 = new Produto("Camiseta", 30.0);
        Produto produto2 = new Produto("Shorts", 100.0);
        Produto produto3 = new Produto("Chinelo", 45.0);

        //criando carrinho de compras
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);
        carrinho.adicionarProduto(produto3);

        //aplicando desconto para ClienteNovo:
        carrinho.setDescontoStrategy(new DescontoClienteNovo());
        System.out.println("Total para ClienteNovo R$ " + carrinho.calcularTotal());

        //aplicando desconto para ClienteRegular:
        carrinho.setDescontoStrategy(new DescontoClienteRegular());
        System.out.println("Total para ClienteRegular " + carrinho.calcularTotal());

        //aplicando desconto para ClienteVip:
        carrinho.setDescontoStrategy(new DescontoClienteVip());
        System.out.println("Total para ClienteVip " + carrinho.calcularTotal());
    }
}