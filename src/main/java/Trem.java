import java.util.ArrayList;
import java.util.List;

public class Trem {
    private List<Vagao> vagoes = new ArrayList<>();

    public void adicionarVagao(String prefixo, String nomeModelo,double capacidade) {
        Modelo modelo = ModeloFactory.getModelo(nomeModelo, capacidade);
        Vagao vagao = new Vagao(prefixo, modelo);
        vagoes.add(vagao);
    }

    public List<String> obterVagoes() {
        List<String> saida = new ArrayList<>();
        for (Vagao vagao : this.vagoes) {
            saida.add(vagao.obterVagao());
        }
        return saida;
    }
}
