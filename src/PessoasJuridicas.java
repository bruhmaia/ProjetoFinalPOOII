public class PessoasJuridicas implements Clientes {
    private int CNPJ;
    public  String nome;
    private int CNH;
    public int idade;

    public PessoasJuridicas(String nome, int CNH, int CNPJ, int idade) {
        this.CNH=CNH;
        this.idade=idade;
        this.nome=nome;
        this.CNPJ=CNPJ;
    }

    @Override
    public double desconto(int dias) {
        double desconto=0;
        if (dias > 5) {
            desconto=0.05;
        }
        return desconto;
    }
}


