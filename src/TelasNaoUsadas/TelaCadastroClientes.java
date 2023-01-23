package TelasNaoUsadas;

import java.util.List;
import java.util.Scanner;

public class TelaCadastroClientes {
    public void CadastroClientes() {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        System.out.println("Escolha qual tipo de cliente deja cadastrar \n (1) - pessoa fisica \n (2) - pessoa juridica");

        List<Clientes> clientes = List.of(pessoasFisicas, pessoasJuridicas);
        public static void adicionar(Clientes clientes) {
        opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Escreva o nome da pessoa a ser cadastrada");
                String nome = scanner.next();
                System.out.println("Escreva o CPF da pessoa a ser cadastrada");
                int CPF = scanner.nextInt();
                System.out.println("Escreva o CPF da pessoa a ser cadastrada");
                int CNH = scanner.nextInt();
                System.out.println("Escreva o idade da pessoa a ser cadastrada");
                int idade = scanner.nextInt();
                PessoasFisicas pessoasFisicas = new PessoasFisicas(nome, CPF, CNH, idade);
                System.out.println("Novo cliente cadastrado");

            case 2:
                System.out.println("Escreva o nome da pessoa juridica a ser cadastrada");
                String nomeJUR = scanner.next();
                System.out.println("Escreva o CNPJ da pessoa juridica a ser cadastrada");
                int CNPJ = scanner.nextInt();
                System.out.println("Escreva o CNH da pessoa a ser responsavel por digigir o veiculo");
                int CNHjur = scanner.nextInt();
                System.out.println("Escreva o idade da pessoa responsavel por digigir o veiculo");
                int idadejur = scanner.nextInt();
                PessoasJuridicas pessoasJuridicas = new PessoasJuridicas(nomeJUR, CNHjur, CNPJ, idadejur);
                System.out.println("Novo cliente cadastrado");
        }
    }
}

