import java.util.ArrayList;
import java.util.List;

public class LocacaoAutomovel {

    public static List<String> escolherAutomovelPossivel ( RequisicaoLocacaoAutomovel requisicao) {

        List<String> possiveisEscolhas = new ArrayList<>();

        if (requisicao.getIdade() > 35 && requisicao.getSalario() >= 2.500) {
            possiveisEscolhas.add("Passeio");
        }

        if (requisicao.getIdade() >= 25 && requisicao.getIdade() <= 40 && requisicao.getEstadoResidente().equalsIgnoreCase("SP") && requisicao.getSalario() >= 4.000 ){
            possiveisEscolhas.add("Moto");
        }

        if (requisicao.getIdade() >= 35 && requisicao.getSalario() >= 5.000){
            possiveisEscolhas.add("Carro Luxo");
        }
        return possiveisEscolhas;
    }
}




