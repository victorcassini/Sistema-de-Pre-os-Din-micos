public class DescontoClienteNovo implements DescontoStrategy {
    @Override
    public double aplicarDesconto(double preco) {
        return preco;
    }
}
