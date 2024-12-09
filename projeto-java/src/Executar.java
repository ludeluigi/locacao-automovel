import java.util.List;
import java.util.Scanner;

public class Executar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual seu Nome? ");
        String nome = scan.nextLine();

        System.out.println("Qual sua Idade? ");
        int idade = scan.nextInt();
        scan.nextLine();

        System.out.println("Informe o seu Estado (UF)");
        String estadoResidente = scan.nextLine();

        System.out.println("Informe o seu salário: ");
        double  salario = scan.nextDouble();

        RequisicaoLocacaoAutomovel requisicao = new RequisicaoLocacaoAutomovel(nome, idade, salario, estadoResidente);


        List<String> automoveisDisponiveis = LocacaoAutomovel.escolherAutomovelPossivel(requisicao);
        if(automoveisDisponiveis.isEmpty()){
            System.out.println(nome + ", não puedes locar garotito" );
        } else{
            System.out.println(nome + " Automovél disp: " + automoveisDisponiveis);

        }

    }
}
