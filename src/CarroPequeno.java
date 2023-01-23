public class CarroPequeno implements Veiculo {
    String placa;
    String marca;

    public CarroPequeno(String placa, String marca) {
        this.placa = placa;
        this.marca = marca;
    }

        @Override
        public double diariaAluguel ( int dias){
            return 100 * dias;
        }
    }
