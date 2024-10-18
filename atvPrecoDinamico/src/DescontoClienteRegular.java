public class DescontoClienteRegular implements DescontoStrategy {
    @Override
    public double aplicarDesconto(double preco) {
        return preco - (preco * 10) / 100 ;
    }
}
