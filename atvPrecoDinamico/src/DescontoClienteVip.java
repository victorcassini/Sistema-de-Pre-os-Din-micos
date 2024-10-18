public class DescontoClienteVip implements DescontoStrategy{

    @Override
    public double aplicarDesconto(double preco) {
        return preco - (preco * 20) / 100;
    }
}
