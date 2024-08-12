import java.util.ArrayList;
import java.util.List;

public class LocacaoAutomovel {

    public static List<String> escolherAutomovelPossivel ( int idade, double salario, String estadoResidente) {

        List<String> possiveisEscolhas = new ArrayList<>();

        if (idade > 35 && salario >= 2.500) {
            possiveisEscolhas.add("Passeio");
        }

        if (idade >= 25 && idade <= 40 && estadoResidente.equalsIgnoreCase("SP") && salario >= 4.000 ){
            possiveisEscolhas.add("Moto");
        }

        if (idade >= 35 && salario >= 5.000){
            possiveisEscolhas.add("Carro Luxo");
        }
        return possiveisEscolhas;
    }
}

