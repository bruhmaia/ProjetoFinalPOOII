public class Aluguel{
    int dias;
    public Clientes cliente;
    public Veiculo veiculo;


    public Aluguel (Clientes cliente, Veiculo veiculo, int dias){
        this.dias=dias;
        this.cliente=cliente;
        this.veiculo=veiculo;

    }

    public int getDias() {
        return dias;
    }

    public double getPreco(int dias){
        double PrecoDiaria = veiculo.diariaAluguel(getDias());
        double desconto=cliente.desconto(getDias());
        double PrecoFinal= PrecoDiaria-PrecoDiaria*desconto;
        return PrecoFinal;
    }

}

