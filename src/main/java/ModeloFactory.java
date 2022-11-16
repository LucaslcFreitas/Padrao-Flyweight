import java.util.HashMap;
import java.util.Map;

public class ModeloFactory {
    private static Map<String, Modelo> modelos = new HashMap<>();

    public static Modelo getModelo(String nome, double capacidade) {
        Modelo modelo = modelos.get(nome);
        if (modelo == null) {
            modelo = new Modelo(nome, capacidade);
            modelos.put(nome, modelo);
        }
        return modelo;
    }

    public static int getTotalModelos() {
        return modelos.size();
    }
}
