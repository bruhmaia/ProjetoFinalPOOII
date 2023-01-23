public class SUV  implements Veiculo {
    String placa;
    String marca;

    public SUV(String placa, String marca) {
        this.placa = placa;
        this.marca = marca;
    }

    @Override
    public double diariaAluguel(int dias) {
        return 200*dias;
    }
}
