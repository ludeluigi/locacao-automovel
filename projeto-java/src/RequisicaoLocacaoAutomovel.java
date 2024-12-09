public class RequisicaoLocacaoAutomovel {
    private String nome;
    private int idade;
    private double salario;
    private String estadoResidente;

    public RequisicaoLocacaoAutomovel(String nome, int idade, double salario, String estadoResidente){
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.estadoResidente = estadoResidente;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getSalario() {
        return salario;
    }

    public String getEstadoResidente() {
        return estadoResidente;
    }
}
