public class Vagao {
    private String prefixo;
    private Modelo modelo;

    public Vagao(String prefixo, Modelo modelo) {
        this.prefixo = prefixo;
        this.modelo = modelo;
    }

    public String obterVagao() {
        return "Vagao{" +
                "prefixo='" + this.prefixo + '\'' +
                ", nome='" + modelo.getNome() + '\'' +
                ", capacidade='" + modelo.getCapacidade() + '\'' +
                '}';
    }
}
