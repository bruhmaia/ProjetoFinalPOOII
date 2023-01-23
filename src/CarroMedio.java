public class CarroMedio implements Veiculo {
    String placa;
    String marca;
    public CarroMedio (String placa, String marca){
        this.placa=placa;
        this.marca=marca;
    }

    @Override
    public double diariaAluguel(int dias) {
        return 150*dias;
    }
}
