public class PessoasFisicas implements Clientes {

    private int CPF;
    public  String nome;
    private int CNH;
    public int idade;

    public PessoasFisicas(String nome, int CNH, int CPF, int idade) {
        this.CPF = CPF;
        this.CNH=CNH;
        this.idade=idade;
        this.nome=nome;

    }

    @Override
    public double desconto(int dias) {
        double desconto = 0;
        if (dias > 3) {
            desconto=0.1;
        }
        return desconto;
    }
}
