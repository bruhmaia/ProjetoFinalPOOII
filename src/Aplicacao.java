import java.util.List;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {

        Clientes cliente = new PessoasJuridicas("Code S.A", 124432, 21232, 21);
        Veiculo veiculo = new SUV("1234", "FORD");
        int dias = 10;

        Aluguel aluguel = new Aluguel(cliente, veiculo, dias);
        System.out.println(aluguel.getPreco(dias));

        Clientes cliente2 = new PessoasFisicas("Bruna", 121232, 00000000000, 25);
        Veiculo veiculo2 = new SUV("2346", "FORD");
        int diasusados = 10;
        Aluguel aluguel1 = new Aluguel(cliente2, veiculo2, diasusados);
        System.out.println(aluguel1.getPreco(diasusados));
    }
}